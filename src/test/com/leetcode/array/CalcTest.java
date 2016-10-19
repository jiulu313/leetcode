package test.com.leetcode.array; 

import com.leetcode.array.Calc;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Calc Tester. 
* 
* @author <Authors name> 
* @since <pre>十月 19, 2016</pre> 
* @version 1.0 
*/ 
public class CalcTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(int a, int b) 
* 
*/ 
@Test
public void testAdd() throws Exception {
    Calc calc = new Calc();
    int sum = calc.add(3,4);
    System.out.println(sum);
} 


} 
