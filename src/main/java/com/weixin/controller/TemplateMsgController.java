/*
 * 文件名：TemplatMsgController.java
 * 版权：Copyright by www.chinauip.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2018年1月19日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.weixin.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.R;
import com.weixin.service.TemplateMsgService;

@Controller
@RequestMapping("/template")
public class TemplateMsgController
{
    @Autowired
    private TemplateMsgService templateMsgService;
    
    @RequestMapping("/test")
    @ResponseBody
    public R getJsSdkData(){
        templateMsgService.sendMsg();
        System.out.println("====1====");
        return R.ok();
    }
}
