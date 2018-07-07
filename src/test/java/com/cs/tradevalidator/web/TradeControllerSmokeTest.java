package com.cs.tradevalidator.web;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cs.tradevalidator.web.controller.TradeController;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TradeControllerSmokeTest {
	
	  @Autowired
	  private TradeController controller;
	 
	 @Test
	 public void contexLoads() throws Exception {
        Assert.assertNotNull(controller);
    }
}
