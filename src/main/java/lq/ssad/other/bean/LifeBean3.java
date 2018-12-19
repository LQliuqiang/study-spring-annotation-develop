package lq.ssad.other.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class LifeBean3 {

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


    @PostConstruct
    private void init() {
        System.out.println("LifeBean3.........init.........");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("LifeBean3........destroy........");
    }

}
