/*
 * 文件名：TemplateMsgService.java
 * 版权：Copyright by www.chinauip.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2018年1月19日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.weixin.service;

import org.springframework.stereotype.Service;

import com.weixin.util.ConstantUtils;
import com.weixin.util.HttpClientUtils;

@Service
public class TemplateMsgService
{

    
    public void sendMsg(){
        StringBuilder json = new StringBuilder();
        json.append("{\"touser\":\"o3I7-wr5xoizObyUfygReI7uS72A\", \"template_id\":\"UQYpL_240korjdj6pvbeFLbyS2nuCYt_3E-7GjfzBrY\",");
        json.append("\"url\":\"http://weixin.qq.com/download\",");
        json.append("\"topcolor\":\"#FF0000\",");
        json.append("\"data\":{\"first\": {\"value\":\"黄先生\",\"color\":\"#173177\"}}}");
        System.out.println("json="+json.toString());
        String res=HttpClientUtils.commonPost(ConstantUtils.getTemplateMsgUrl(), json.toString(), null, "utf-8", "utf-8");
        System.out.println(res);
    }
    
}
