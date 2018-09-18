package org.vincent.springframework.ioc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)  //该注解表明Repository注解是作用在类上面的
@Retention(RetentionPolicy.RUNTIME) //作用域：运行期间有效
public @interface Service {
    String value() default "";
}
