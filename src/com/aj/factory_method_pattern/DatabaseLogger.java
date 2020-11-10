package com.aj.factory_method_pattern;

/**
 * @author aka_after_jason
 * @date 2020-11-10 12:55
 */

/**
 * 数据库日志记录器：具体产品
 */
public class DatabaseLogger implements Logger {

    // 实现接口定义的方法
    @Override
    public void writeLog() {
        System.out.println("写入数据库日志记录");
    }
}
