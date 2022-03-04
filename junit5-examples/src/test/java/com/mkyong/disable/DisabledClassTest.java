package com.mkyong.disable;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.javatpoint.logic.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

//@Disabled("Disabled until bug #2019 has been fixed!")
public class DisabledClassTest {

    @Test
    void test1Plus1() {
    	sum  s=new sum();
      //  assertEquals(2, 1 + 1);
        assertEquals(5, s.add(2,3));
        
    }

    @Test
    void test2Plus2() {
        assertEquals(4, 2 + 2);
    }

}
