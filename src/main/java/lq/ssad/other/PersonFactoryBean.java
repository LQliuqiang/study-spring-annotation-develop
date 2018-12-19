package lq.ssad.other;

import lq.ssad.bean.Person;
import org.springframework.beans.factory.FactoryBean;

public class PersonFactoryBean implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        return new Person(564,"sdsdff");
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    //是单例？
    //true：这个bean是单实例，在容器中保存一份
    //false：多实例，每次获取都会创建一个新的bean；
    @Override
    public boolean isSingleton() {
        return false;
    }
}
