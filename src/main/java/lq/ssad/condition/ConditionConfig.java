package lq.ssad.condition;

import lq.ssad.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 较为重要的两个注解 @Conditional 与 @Import （因为SpringBoot底层用的比较多）
 */
//类中组件统一设置。满足当前条件，这个类中配置的所有bean注册才能生效；
//@Conditional({WindowsCondition.class})
@Configuration
@ComponentScan({"lq.ssad.condition","lq.ssad.bean"})
public class ConditionConfig {


    @Conditional({WindowsCondition.class})
    @Bean
    public User user(){
        return new User(1,"lq");
    }

    @Conditional({LinuxCondition.class})
    @Bean
    public User user2(){
        return new User(2,"lf");
    }

    @Bean
    public Person person(){
        return new Person(3,"kr");
    }
}
