package ru.netology.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashBackJunitJupiterApiTest {
    CashbackHackService cash=new CashbackHackService();
    @org.junit.jupiter.api.Test
    public void testRemain() {
        int testParam=2001;
        int actual=cash.remain(testParam);
        int expected=999;
        assertEquals(actual,expected);
    }
    @Test
    public void negativeTest(){
        int testParam=2000;
        int actual=cash.remain(testParam);
        int expected=0;
        assertEquals(actual,expected);
    }
    @Test
    public void pozitiveTestBoundaryValues(){
        int testParam=1999;
        int actual=cash.remain(testParam);
        int expected=1;
        assertEquals(actual,expected);
    }
    @Test
    public void pozitiveTestValues(){
        int testParam=1500;
        int actual=cash.remain(testParam);
        int expected=500;
        assertEquals(actual,expected);
    }
}
