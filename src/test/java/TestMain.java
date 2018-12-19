import lq.ssad.aop.AopConfig;
import lq.ssad.aop.MathCalculator;
import lq.ssad.condition.ConditionConfig;
import lq.ssad.custom_filter.FilterConfig;
import lq.ssad.other.OtherConfig;
import lq.ssad.other.bean.LifeBean;
import lq.ssad.test_import.ImportConfig;
import lq.ssad.thing.TxConfig;
import lq.ssad.thing.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import lq.ssad.bean.*;

public class TestMain {


    @Test
    public void testAopConfig(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AopConfig.class);
        MathCalculator mathCalculator = ac.getBean(MathCalculator.class);
        int div = mathCalculator.div(10, 2);
        System.out.println(div);
    }

    @Test
    public void testConditionConfig(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(ConditionConfig.class);
        User user = ac.getBean(User.class);
        System.out.println(user.toString());

        Person bean = ac.getBean(Person.class);
        System.out.println(bean.getName());
    }

    @Test
    public void testCustomFilterConfig(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(FilterConfig.class);

        String[] names = ac.getBeanDefinitionNames();
        for (String name:names){
            System.out.println("name:"+name);
        }
    }

    @Test
    public void testImportConfig(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(ImportConfig.class);
//        String[] names = ac.getBeanDefinitionNames();
//        for (String name:names){
//            System.out.println("name:"+name);
//        }
        Employee employee = (Employee)ac.getBean("lq.ssad.bean.Employee");
        employee.setId(12456);
        employee.setName("你好啊");
        System.out.println(employee.toString());
    }

    @Test
    public void testOtherConfig(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(OtherConfig.class);
        Person person = (Person) ac.getBean("personFactoryBean");
        System.out.println("person：" + person.toString());
        System.out.println("-------------------------------------------");
        LifeBean lifeBean = ac.getBean(LifeBean.class);
        System.out.println(lifeBean.toString());
        ac.close();
    }

    @Test
    public void testTx(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = ac.getBean(UserService.class);
        int i = userService.insert(6, "kkll");
        System.out.println(i);

    }

}
