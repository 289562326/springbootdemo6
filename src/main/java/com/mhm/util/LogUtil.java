//package com.mhm.util;
//
//import org.apache.logging.log4j.Level;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.spi.ExtendedLogger;
//import org.apache.logging.log4j.util.ReflectionUtil;
//
///**
// * log4j工具类
// * 使用此类必须引入
// * Created by MaHuiming on 2018/11/1.
// */
//public class LogUtil {
//
//    public static String sublog(String logInfo, int length){
//        if (logInfo.length() < length) {
//            return logInfo;
//        }
//        return logInfo.substring(0, length) + "...";
//    }
//
//    public static void debug(String msg, Object... params) {
//        String callerFQNC = ReflectionUtil.getCallerClass(1).getName();
//        String className = ReflectionUtil.getCallerClass(2).getName();
//        ExtendedLogger log = LogManager.getContext().getLogger(className);
//        log.logIfEnabled(callerFQNC, Level.DEBUG, null, msg, params);
//    }
//
//    public static void info(String msg, Object... params) {
//        String callerFQNC = ReflectionUtil.getCallerClass(1).getName();
//        String className = ReflectionUtil.getCallerClass(2).getName();
//        ExtendedLogger log = LogManager.getContext().getLogger(className);
//        log.logIfEnabled(callerFQNC, Level.INFO, null, msg, params);
//    }
//
//    public static void warn(String msg, Object... params) {
//        String callerFQNC = ReflectionUtil.getCallerClass(1).getName();
//        String className = ReflectionUtil.getCallerClass(2).getName();
//        ExtendedLogger log = LogManager.getContext().getLogger(className);
//        log.logIfEnabled(callerFQNC, Level.WARN, null, msg, params);
//    }
//
//    public static void error(String msg, Object... params) {
//        String callerFQNC = ReflectionUtil.getCallerClass(1).getName();
//        String className = ReflectionUtil.getCallerClass(2).getName();
//        ExtendedLogger log = LogManager.getContext().getLogger(className);
//        log.logIfEnabled(callerFQNC, Level.ERROR, null, msg, params);
//    }
//}
