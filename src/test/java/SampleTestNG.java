import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNG {


    @BeforeTest
    public void test1(){

        System.out.println("This is Before Test");
    }

    @Test(groups={"smoke"})
    public void test2(){

        System.out.println("This is Test2");
        System.out.println("Hi");
        System.out.println("How are You");

    }
    @Test(groups={"Stress"})
    public void test3()throws ArithmeticException
    {
        int a = 5;
        int b = 1;
        System.out.println(a / b);
    }
    @Test(timeOut=5000,groups={"smoke"},invocationCount=3)
    public void timeout() throws InterruptedException {
        Thread.sleep(4000);
}

   @AfterTest
   public void AfterTest(){
        System.out.println("This is AfterTest");

    }
}
