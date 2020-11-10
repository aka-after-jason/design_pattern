package com.aj.factory_method_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-10 12:56
 */

/**
 * 文件日志记录器：具体产品
 */
public class FileLogger implements Logger {
    // 实现接口定义的方法
    @Override
    public void writeLog() {
        System.out.println("写入文件日志记录");
    }
}
