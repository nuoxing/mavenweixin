/*
 * 文件名：ExceptionHandler.java 版权：Copyright by www.chinauip.com 描述： 修改人：Administrator 修改时间：2017年7月25日
 * 跟踪单号： 修改单号： 修改内容：
 */

package com.common.controller;


import java.io.PrintWriter;
import java.io.StringWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.R;


/**
 * 全局自定义的异常处理，对controller进行增加操作，捕获异常 〈功能详细描述〉
 * 
 * @author suwy
 * @version 2017年7月25日
 * @see ExceptionController
 * @since
 */
@ControllerAdvice
public class ExceptionController
{

    /**
     * 日志对象
     */
	private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);

    public ExceptionController()
    {

    }

    /**
     * 描述: 全局的异常处理，捕获controller层抛出的异常，记录异常到日志文件，返回提示给前端<br> 
     * 2、…<br>
     * 
     * @param ex
     *            异常
     * @return 结果返回
     * @see
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R handleBizExp(Exception ex)
    {
        StringWriter sw = new StringWriter();
        ex.printStackTrace(new PrintWriter(sw, true));
        logger.error("系统错误，错误信息=" + sw.toString());
        return R.error("系统异常，请你重新操作或报障");
    }

}
