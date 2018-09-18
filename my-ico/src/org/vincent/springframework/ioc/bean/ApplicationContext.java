package org.vincent.springframework.ioc.bean;

import org.vincent.springframework.ioc.factory.BeanFactory;
import org.vincent.springframework.ioc.xml.BeanXMLReaderUtil;

public abstract class ApplicationContext extends BeanFactory {
    protected String configLocation;
    protected BeanXMLReaderUtil util = null;

    public ApplicationContext() {
    }

    public ApplicationContext(String configLocation) {
        util = new BeanXMLReaderUtil();
        this.configLocation = configLocation;
    }

    protected abstract Object getBean(String beanName, Class<?> cl);
}
