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
@MapperScan(basePackages = "com.fengyue.threemapper" ,sqlSessionFactoryRef = "threeSqlSessionFactory")
public class ThreeDataSourceConfig {
    @Bean(name = "threeDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.three")
//    @Primary
    public DataSource setDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "threeSqlSessionFactory")
//    @Primary
    public SqlSessionFactory threeSqlSessionFactory(@Qualifier("threeDataSource") DataSource dataSource) throws Exception{
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //读取mybatis小配置文件
         bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:com/fengyue/threemapper/xml/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "threeTransactionManager")
//    @Primary
    public DataSourceTransactionManager threeTransactionManager(@Qualifier("threeDataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "threeSqlSessionTemplate")
//    @Primary
    public SqlSessionTemplate threeSqlSessionTemplate(@Qualifier("threeSqlSessionFactory") SqlSessionFactory threeSqlSessionFactory) throws Exception{
        return new SqlSessionTemplate(threeSqlSessionFactory);
    }


}
