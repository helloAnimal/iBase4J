package org.ibase4j.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 描述：
 * User:
 * Date: 2016/5/25
 * Time: 16:24
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Spring-config.xml"})
public class DataSourceTest {
    @Test
    public void print(){
        System.out.println("******************");
    }
}
