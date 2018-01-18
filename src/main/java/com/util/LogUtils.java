/*
 * 文件名：LogUtils.java 版权：Copyright by www.chinauip.com 描述： 修改人：Administrator 修改时间：2017年11月14日 跟踪单号：
 * 修改单号： 修改内容：
 */

package com.util;


import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 日志工具类 〈功能详细描述〉
 * 
 * @author suwy
 * @version 2017年11月14日
 * @see LogUtils
 * @since
 */
public class LogUtils
{

    public static void error(Class<?> calss, String message)
    {
        Logger logger = LoggerFactory.getLogger(calss);
        logger.error(message);
    }

    public static void info(Class<?> calss, String message)
    {
        Logger logger = LoggerFactory.getLogger(calss);
        logger.info(message);
    }


}
