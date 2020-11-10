package com.aj.factory_method_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-10 12:59
 */

/**
 * 数据库日志记录工厂类：具体工厂
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        System.out.println("创建数据库日志记录器");
        return logger;
    }
}
