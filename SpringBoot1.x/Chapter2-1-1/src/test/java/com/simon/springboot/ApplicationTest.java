package com.simon.springboot;

import com.simon.springboot.domain.SimonProperties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTest {

    private static final Log log= LogFactory.getLog(ApplicationTest.class);

    @Autowired
    private SimonProperties simonProperties;

    @Test
    public void getHello(){

        Assert.assertEquals(simonProperties.getName(),"simon");
        Assert.assertEquals(simonProperties.getTitles(),"SpringBoot教程");
        System.out.println(simonProperties.getDesc());
    }

    @Test
    public void testRandom(){

        log.info("随机数测试输出： ");
        log.info("随机字符串："+simonProperties.getString());
        log.info("随机整数： "+simonProperties.getAnInt());
        log.info("随机长整型： "+simonProperties.getaLong());
        log.info("随机10以内的整型： "+simonProperties.getTest1());
        log.info("随机10-20的整型： "+simonProperties.getTest2());

    }
}
