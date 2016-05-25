package org.ibase4j.core;

import org.ibase4j.mybatis.generator.dao.SysUserMapper;
import org.ibase4j.service.sys.SysUserService;
import org.ibase4j.service.task.CoreTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

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
    private CoreTask coreTask;
//    private SysUserService sysUserService;

    @Test
    public void print() {
//        sysUserService.queryById(1);
        coreTask.run();
        System.out.println("******************");
    }
}
