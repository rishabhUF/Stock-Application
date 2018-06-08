package com.rishabh.stockapplication.web;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class StockControllerStock {

    @InjectMocks
    StockController stockController;


    @Test
    public void testRecordStock(){
        String name = "GOOGL";
        //when().thenReturn();
        String stock = stockController.recordStock(name);
        Assert.assertEquals(stock,name);
    }
}
