/*
 * �ļ�����JsSdkController.java
 * ��Ȩ��Copyright by www.chinauip.com
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2018��1��17��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package com.weixin.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.R;
import com.weixin.service.JsSdkService;

@Controller
@RequestMapping("/jsSdk")
public class JsSdkController
{

    @Autowired
    private JsSdkService jsSdkService;
    
    
    /**
     * 
     * 描述:获取js sdk调用的一些参数 <br>
     * 
     * @param url
     * @return 
     * @see
     */
    @RequestMapping("/getData")
    @ResponseBody
    public R getJsSdkData(String url){
        System.out.println("url="+url);
        Map<String, String> map = jsSdkService.getJsSdkData(url);
        System.out.println(map.get("signature"));
        return R.ok().put(map);
    }
    
}
