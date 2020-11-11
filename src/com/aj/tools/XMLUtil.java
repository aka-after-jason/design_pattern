package com.aj.tools;

/**
 * @author aka_after_jason
 * @date 2020-11-10 12:19
 */

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * 工具类 ： 用来读取配置文件中的字符串参数
 */
public class XMLUtil {

    /**
     * 获取配置文件中的图表类型，并返回
     * @return
     */
    public static String getChartType(){
        try {
            // 创建文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document = builder.parse(new File("chart_type.xml"));
            // 获取文本节点
            NodeList nodeList = document.getElementsByTagName("chartType");
            Node node = nodeList.item(0).getFirstChild();
            String chartType = node.getNodeValue().trim();
            return chartType;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 从XML文件中提取具体类名，并返回一个实例对象
     * @return
     */
    public static Object getBean(){
        try {
            // 创建文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            //document = builder.parse(new File("class_name.xml"));
            document = builder.parse(new File("skin_type.xml"));
            // 获取文本节点
            NodeList nodeList = document.getElementsByTagName("className");
            Node node = nodeList.item(0).getFirstChild();
            String className = node.getNodeValue().trim();
            // 通过类名生成实例对象并将其返回(注意这里需要制定包名和类名)
            //Class c = Class.forName("com.aj.factory_method_pattern."+className);
            Class c = Class.forName("com.aj.abstract_factory_pattern."+className);
            Object object = c.newInstance();
            return object;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
