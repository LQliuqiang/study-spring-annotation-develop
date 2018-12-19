package lq.ssad.other.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 配置bean的后置处理器   作用在配置bean初始化方法的前后执行
 *
 * 会扫描配置里面所有的bean 对所有的bean起作用
 */
//@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

//    init-method方法之前调用
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization:"+beanName);
        return bean;
    }

    //    init-method方法之后调用
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization:"+beanName);
        return bean;
    }
}
