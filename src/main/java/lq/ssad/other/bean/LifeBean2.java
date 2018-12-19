package lq.ssad.other.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

//@Component
public class LifeBean2 implements InitializingBean, DisposableBean {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void destroy() throws Exception {
        System.out.println("LifeBean2........destroy........");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeBean2.........init.........");
    }
}
