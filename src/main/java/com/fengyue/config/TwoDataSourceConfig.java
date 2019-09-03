package com.fengyue.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * 配置多个数据源
 */


@Configuration
@MapperScan(basePackages = "com.fengyue.twomapper" ,sqlSessionFactoryRef = "twoSqlSessionFactory")
public class TwoDataSourceConfig {
    @Bean(name = "twoDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.two")
//    @Primary
    public DataSource setDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "twoSqlSessionFactory")
//    @Primary
    public SqlSessionFactory twoSqlSessionFactory(@Qualifier("twoDataSource") DataSource dataSource) throws Exception{
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //读取mybatis小配置文件
         bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:com/fengyue/twomapper/xml/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "twoTransactionManager")
//    @Primary
    public DataSourceTransactionManager twoTransactionManager(@Qualifier("twoDataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "twoSqlSessionTemplate")
//    @Primary
    public SqlSessionTemplate twoSqlSessionTemplate(@Qualifier("twoSqlSessionFactory") SqlSessionFactory twoSqlSessionFactory) throws Exception{
        return new SqlSessionTemplate(twoSqlSessionFactory);
    }


}
