package lq.ssad.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;

//SpringMVC只扫描Controller；子容器
@Configuration
@ComponentScan(value="lq.ssad",includeFilters={
        @ComponentScan.Filter(type= FilterType.ANNOTATION,classes={Controller.class})
},useDefaultFilters=false) //useDefaultFilters=false 禁用默认的过滤规则,否则includeFilters不生效；
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter {

    //定制

    //视图解析器
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //默认所有的页面都从 /WEB-INF/ xxx .jsp
        //registry.jsp();
        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    //静态资源访问
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    //拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //super.addInterceptors(registry);
//        registry.addInterceptor(new MyFirstInterceptor())
//                .addPathPatterns("/**");//配置拦截所有的url地址
    }

}
