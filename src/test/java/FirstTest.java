import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    private String text;
   @Test
    public void ourFirstTest() {
        Integer a= 15;
        Integer b= 99;
        Integer c= 34;
        Integer d= 42;
        text = "The sum is: ";

        sumAndPrint(a,b);

        Integer sum2 = c + d;

       System.out.println(sum2);
       Assertions.assertArrayEquals(76, c + d, "wrong sum");
    }
    private void sumAndPrint(int a, int b){
       Integer sum = a + b;
       System.out.println( text + sum);

    }
}
