package com.xianfeng.data.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@MapperScan(basePackages = "com.xianfeng.data.db.gmssdk", sqlSessionFactoryRef = "gmssdkSqlSessionFactory")
public class GmssdkDBConfig {

    @Bean
    @ConfigurationProperties(prefix = "datasource.gmssdk")
    public DataSource gmssdkDataSource() {
        return new HikariDataSource();
    }

    @Bean
    public SqlSessionFactory gmssdkSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(gmssdkDataSource());
        //扫描mapper xml文件
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        bean.setMapperLocations(resolver.getResources("classpath*:mapping/*.xml"));
        //扫描实体类
        bean.setTypeAliasesPackage("com.xianfeng.data.db.gmssdk.bean");
        org.apache.ibatis.session.Configuration configuration = bean.getObject().getConfiguration();
        //#进行自动映射时，数据以下划线命名，如数据库返回的"order_address"命名字段是否映射为class的"orderAddress"字段。默认为false
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setJdbcTypeForNull(JdbcType.NULL);
        configuration.setCacheEnabled(true);
        // 配置打印sql语句
        configuration.setLogImpl(StdOutImpl.class);
        bean.setConfiguration(configuration);
        return bean.getObject();
    }

    @Bean
    public DataSourceTransactionManager gmssdkTransactionManager() throws SQLException {
        return new DataSourceTransactionManager(gmssdkDataSource());
    }

}
