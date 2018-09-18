package org.vincent.springframework.ioc.factory;

/**
 * 容器对象的工厂类
 */
public abstract class BeanFactory {
    public Object getBean(String beanName){
        return doGetBean(beanName);
    };

    protected abstract Object doGetBean(String beanName);
}
