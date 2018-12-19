package lq.ssad.other.bean;

public class LifeBean {

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

    private void init() {
        System.out.println("LifeBean.........init.........");
    }

    private void destroy() {
        System.out.println("LifeBean........destroy........");
    }

    @Override
    public String toString() {
        return "LifeBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
