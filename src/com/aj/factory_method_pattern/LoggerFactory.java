package com.aj.factory_method_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-10 12:57
 */

/**
 * 日志记录器工厂接口：抽象工厂
 */
public interface LoggerFactory {
    public Logger createLogger(); // 创建日志
}
