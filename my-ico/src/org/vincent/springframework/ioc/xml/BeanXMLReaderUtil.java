package org.vincent.springframework.ioc.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;

/**
 * <pre>
 *     通过配置文件解析出框架中需要被扫描的包路径
 * </pre>
 * 解析Xml文件
 */
public class BeanXMLReaderUtil {

    /**
     * 容器的配置文件名称
     */
    public String handlerXMLForScanPackage(String configLocation) {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(configLocation);
        //创建一个dom4j的解析对象
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(inputStream);
            Element rootElement = document.getRootElement();
            Element element = rootElement.element("package-scan");
            return element.attributeValue("component-scan");
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return null;
    }
}
