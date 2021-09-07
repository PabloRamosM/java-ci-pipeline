package Tests;

import Calculator.Calculator;
import junit.framework.TestCase;

public class CalcTest extends TestCase {
    int n1=  11;
    int n2=  11;
    private Calculator operation;
    public void scenario(){
        operation = new Calculator();
    }
    public void testAdd(){
        scenario();
        assertSame(operation.sumDigits(123), 1+2+3);
    }
    public void testMult(){
        scenario();
        assertSame(operation.prime(n1, n2), true);
    }
    public void testContains(){
        scenario();
        int[] arr = {0,2,1,2,4,2,2};
        assertSame(operation.contains(1,arr),true);
    }
    public void testTimesRepeated(){
        scenario();
        int[] arr = {0,2,1,2,4,2,2};
        assertSame(operation.timesRepeated(2,arr),4);
    }
}
