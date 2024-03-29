package com.example.user.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.lang.ArrayUtils;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@ComponentScan(basePackages = {"com.gitee.sunchenbin.mybatis.actable.manager.*"})
public class MybatisTableConfig {
    @Value("${spring.datasource.driver-class-name}")
    private String driver;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    public YamlPropertiesFactoryBean configProperties() throws Exception {
//        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        propertiesFactoryBean.setLocations(resolver.getResources("classpath*:application-dev.yml"));

        //1:加载配置文件
        Resource app = new ClassPathResource("application-dev.yml");
        YamlPropertiesFactoryBean yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
        // 2:将加载的配置文件交给 YamlPropertiesFactoryBean
        yamlPropertiesFactoryBean.setResources(app);
        return yamlPropertiesFactoryBean;
    }

    @Bean
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaxActive(30);
        dataSource.setInitialSize(10);
        dataSource.setValidationQuery("SELECT 1");
        dataSource.setTestOnBorrow(true);
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager() {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource());
        return dataSourceTransactionManager;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources("classpath*:com/gitee/sunchenbin/mybatis/actable/mapping/*/*.xml");
        Resource[] resources2 = resolver.getResources("classpath:mapper/*.xml");
        Resource[] objects = (Resource[]) ArrayUtils.addAll(resources, resources2);
        sqlSessionFactoryBean.setMapperLocations(objects);
//实体类的位置
        sqlSessionFactoryBean.setTypeAliasesPackage("com.example.user.entity.*");
        return sqlSessionFactoryBean;
    }

}