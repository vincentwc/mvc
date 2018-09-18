package org.vincent.springframework.ioc.annotation;

import org.vincent.springframework.ioc.bean.ApplicationContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AnnotationApplicationContext extends ApplicationContext {

    //常见一个保存到需要扫描类的路径缓存
    private List<Class<?>> classCache = Collections.synchronizedList(new ArrayList<>(128));
    //创建一个容器来保存扫描到的容器中实例化对象
    private Map<String, Object> beanDefinations = new ConcurrentHashMap<>(256);

    public AnnotationApplicationContext(String configLocation) {
        super(configLocation);
        //1.获取扫描的包路径
        String packagePath = util.handlerXMLForScanPackage(configLocation);
        //2.执行包的扫描操作
        scanPackage(packagePath);
        //3.执行容器需要管理类的实例化
        doCreateBean();
        //4.执行容器管理实例对象运行期间的装配操作
        pouplateBean();
    }

    /**
     *
     */
    private void pouplateBean() {
    }

    /**
     * 执行ioc的操作
     */
    private void doCreateBean() {
    }

    /**
     * 执行包扫描操作
     */
    private void scanPackage(String packagePath) {
    }

    @Override
    protected Object getBean(String beanName, Class<?> cl) {
        return null;
    }

    /**
     * 真正从容器中获取实例的方法
     */
    @Override
    protected Object doGetBean(String beanName) {
        return this.beanDefinations.get(beanName);
    }
}
