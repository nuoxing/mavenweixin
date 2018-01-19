/*
 * 文件名：Menu.java
 * 版权：Copyright by www.chinauip.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2018年1月19日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.weixin.wechat.menu2;

import net.sf.json.JSONObject;

public class Menu
{

    private Button[] button;

    public Button[] getButton()
    {
        return button;
    }

    public void setButton(Button[] button)
    {
        this.button = button;
    }
    
    
    public static void main(String[] args)
    {
        ViewButton viewButton = new ViewButton();
        viewButton.setName("view按钮");
        viewButton.setType("view");
        viewButton.setUrl("http://www.baidu.com");
        
        ClickButton clickButton = new ClickButton();
        clickButton.setName("click按钮");
        clickButton.setType("click");
        clickButton.setKey("KKK");
        
        
        ExistSubButton subButton = new ExistSubButton();
        subButton.setName("一级存在二级");
        Button[] sub_button = new  Button[2];
        sub_button[0]=viewButton;
        sub_button[1]=clickButton;
        subButton.setSub_button(sub_button);
   
        Button[] buttons = new  Button[3];
        buttons[0]=viewButton;
        buttons[1]=clickButton;
        buttons[2]=subButton;
        Menu menu = new Menu();
        menu.setButton(buttons);
        
        JSONObject json = JSONObject.fromObject(menu);
        System.out.println(json.toString());
    }
    
    
}
