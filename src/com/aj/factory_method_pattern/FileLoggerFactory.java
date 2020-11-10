package com.aj.factory_method_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-10 13:01
 */

/**
 * 文件日志记录器工厂类：具体工厂
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        System.out.println("创建文件日志记录器对象");
        return logger;
    }
}
