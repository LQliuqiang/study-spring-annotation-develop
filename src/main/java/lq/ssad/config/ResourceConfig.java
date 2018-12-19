package lq.ssad.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config.properties")
public class ResourceConfig {

    @Value("${jdbc.url}")
    private String jdbcUrl;

//    @Bean
//    public DataSource dataSource(){
//        System.out.println("jdbcUrl:"+jdbcUrl);
//        DataSource dataSource = new DataSource();
//        dataSource.setUrl(jdbcUrl);
//        return dataSource;
//    }

}
