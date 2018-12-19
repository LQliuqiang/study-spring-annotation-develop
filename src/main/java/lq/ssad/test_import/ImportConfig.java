package lq.ssad.test_import;

import lq.ssad.bean.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Employee.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class ImportConfig {
}
