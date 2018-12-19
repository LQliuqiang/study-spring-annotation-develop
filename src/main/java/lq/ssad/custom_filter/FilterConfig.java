package lq.ssad.custom_filter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * FilterType.ANNOTATION 按照注解指定
 * FilterType.ASSIGNABLE_TYPE 按照给定的类型指定
 * FilterType.CUSTOM 自定义过滤规则
 */
@Configuration
@ComponentScan(value = {"lq.ssad.custom_filter", "lq.ssad.bean"}, useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.CUSTOM, value = {ClassNameFilter.class})
        }
)
public class FilterConfig {

}
