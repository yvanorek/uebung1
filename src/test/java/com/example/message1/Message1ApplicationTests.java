package com.example.message1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Message1ApplicationTests {

    private MessageContoller d =new MessageContoller();

    @Test
    public void sumTest1(){
        //arrange
        int a=6;
        int b=11;
        //act
        int result =d.sum(a,b);
        //assert
        assertEquals(17, result);
    }

}
