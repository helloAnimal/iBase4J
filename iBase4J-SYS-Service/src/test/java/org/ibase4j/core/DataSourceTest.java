package org.ibase4j.core;

import com.alibaba.dubbo.config.annotation.Reference;
import org.ibase4j.facade.sys.SysUserFacade;
import org.ibase4j.mybatis.generator.dao.SysUserMapper;
import org.ibase4j.mybatis.generator.model.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * 描述：
 * User:
 * Date: 2016/5/25
 * Time: 16:24
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Spring-config.xml"})
public class DataSourceTest {
    @Autowired
    private ApplicationContext applicationContext;
    @Reference
    private SysUserFacade sysUserFacade;

    @Test
    public void print() {
        SysUserMapper sysUserMapper= (SysUserMapper) applicationContext.getBean("sysUserMapper");
        List<SysUser> sysUserList=sysUserMapper.selectAll();
        for (SysUser sysUser:sysUserList){
            System.out.println(sysUser.getUserName());
            System.out.println(sysUser.getPassword());
        }
        System.out.println("******************");
    }

    @Test
    public void dubboTest(){
        SysUser sysUser=sysUserFacade.queryById(1);
        System.out.println(sysUser.getUsable());
        System.out.println(sysUser.getPassword());
        System.out.println(sysUser.getAccount());
        System.out.println("***************");
    }
}
