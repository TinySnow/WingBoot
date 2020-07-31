package com.tinysnow.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.LinkedHashMap;


/**
 * 这个类是用来将 application.yml 里面额外设置的 druid 参数绑定到这个类/工程上
 * 以便后续可以监控访问等等
 * @author TinySnow
 */

@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        final ServletRegistrationBean<StatViewServlet> bean =
                new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        // 后台需要有人登录，配置账号和密码
        final LinkedHashMap<String,String> hashMap = new LinkedHashMap<>();
        // 增加配置
        hashMap.put("loginUsername","admin");
        hashMap.put("loginPassword","123456");
        // 允许谁可以访问, Value 不写就默认所有主机都可以访问
        hashMap.put("allow","");
        // 还可以禁止谁能访问，此时的 Key 就是自定义的， Value 指定 ip 地址
        // 例如 hashMap.put("tinysnow","192.168.3.7");

        // 设置初始化参数
        bean.setLoadOnStartup(1);
        bean.setInitParameters(hashMap);
        return bean;
    }
}
