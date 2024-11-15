package com.bny;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testGetMessage() {
        App app = new App();
        String message = app.getMessage();
        Assert.assertEquals("Hello from BNY SDK!", message);
    }
}
