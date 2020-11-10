package com.aj.simple_factory_pattern;

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
}
