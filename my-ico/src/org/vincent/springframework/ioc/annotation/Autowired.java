package org.vincent.springframework.ioc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.METHOD}) //标注在字段，方法上
@Retention(RetentionPolicy.RUNTIME)
public @interface Autowired {

    String value() default "";
}
