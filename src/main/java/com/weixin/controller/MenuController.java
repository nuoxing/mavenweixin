/*
 * �ļ�����MenuController.java
 * ��Ȩ��Copyright by www.chinauip.com
 * ������
 * �޸��ˣ�Administrator
 * �޸�ʱ�䣺2018��1��17��
 * ���ٵ��ţ�
 * �޸ĵ��ţ�
 * �޸����ݣ�
 */

package com.weixin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.R;
import com.weixin.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController
{
    
    @Autowired
    private MenuService menuService;
    
    /**
     * 
     * 描述: 菜单管理 增加自定义菜单<br>
     * 
     * @return 
     * @see
     */
    @RequestMapping("/create")
    @ResponseBody
    public  R createMenu(){
        menuService.createMenu();
        return R.ok();
    }

}
