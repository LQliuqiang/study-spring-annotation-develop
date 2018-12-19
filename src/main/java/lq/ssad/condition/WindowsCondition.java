package lq.ssad.condition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

//判断当前运行环境是否是windows系统
public class WindowsCondition implements Condition {

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		Environment environment = context.getEnvironment();
		String property = environment.getProperty("os.name");

		//4、获取到bean定义的注册类
		BeanDefinitionRegistry registry = context.getRegistry();
		//可以判断容器中的bean注册情况，也可以给容器中注册bean
		boolean definition = registry.containsBeanDefinition("person");
		if (definition){
			System.out.println("WindowsCondition person 有注册在spring容器中");
		}else {
			System.out.println("WindowsCondition person no有注册在spring容器中");
		}

		return property.contains("Windows");
	}

}
