/*
 * 文件名：BaseTest.java
 * 版权：Copyright by www.chinauip.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2017年7月24日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package common;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")  
@ContextConfiguration(locations={
        "classpath:applicationContext.xml","classpath:springmvc.xml","classpath:applicationContext-quartz.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING) //定义方法的顺序，方法名字母排序
public  class BaseTest
{

    @Test
   public void baseTest(){}
    
}
