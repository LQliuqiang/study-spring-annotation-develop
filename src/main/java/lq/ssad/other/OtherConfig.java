package lq.ssad.other;

import lq.ssad.bean.User;
import lq.ssad.other.bean.LifeBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan({"lq.ssad.other","lq.ssad.bean"})
public class OtherConfig {

    /**
     * @Scope:调整作用域 ---默认是单例的
     * prototype：多实例的：ioc容器启动并不会去调用方法创建对象放在容器中。
     * 					每次获取的时候才会调用方法创建对象；
     * singleton：单实例的（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中。
     * 			以后每次获取就是直接从容器（map.get()）中拿，
     * request：同一次请求创建一个实例 （了解）
     * session：同一个session创建一个实例 （了解）
     *
     * 懒加载：
     * 		单实例bean：默认在容器启动的时候创建对象；
     * 		懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象，并初始化；
     *
     */
//    @Scope("prototype") //修改为原型模式
    @Lazy
    @Bean
    public User user(){
        return new User(123,"liu");
    }


    /**
     * 给容器中注册组件的四种方式；
     * 1）、包扫描+组件标注注解（@Controller/@Service/@Repository/@Component）[自己写的类]
     * 2）、@Bean[导入的第三方包里面的组件]
     * 3）、@Import[快速给容器中导入一个组件]
     * 		1）、@Import(要导入到容器中的组件)；容器中就会自动注册这个组件，id默认是全类名
     * 		2）、ImportSelector:返回需要导入的组件的全类名数组；[SpringBoot底层用的比较多]
     * 		3）、ImportBeanDefinitionRegistrar:手动注册bean到容器中
     * 4）、使用Spring提供的 FactoryBean（工厂Bean）; [Spring与其它框架整合的时候经常用到]
     * 		1）、默认获取到的是工厂bean调用getObject创建的对象
     * 		2）、要获取工厂Bean本身，我们需要给id前面加一个&
     * 			&colorFactoryBean
     */
    @Bean
    public PersonFactoryBean personFactoryBean(){
        return new PersonFactoryBean();
    }

    /**
     * 测试bean的周期
     * @return
     */
    @Bean(initMethod = "init",destroyMethod = "destroy" )
    public LifeBean lifeBean() {
        LifeBean lifeBean = new LifeBean();
        lifeBean.setName("lq");
        lifeBean.setAge(24);
        return lifeBean;
    }

}
