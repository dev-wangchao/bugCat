package com.code.spring_version1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jConflictTest {
    
    private static final Logger logger = LoggerFactory.getLogger(Slf4jConflictTest.class);
    
    public static void main(String[] args) {
        try {
            // 尝试使用slf4j记录日志
            logger.info("测试slf4j日志输出");
            logger.debug("这是debug信息");
            logger.warn("这是警告信息");
            logger.error("这是错误信息");
            
            // 输出当前使用的slf4j实现
            System.out.println("SLF4J implementation: " + logger.getClass().getName());
            
        } catch (Exception e) {
            System.err.println("SLF4J绑定冲突检测到异常: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
