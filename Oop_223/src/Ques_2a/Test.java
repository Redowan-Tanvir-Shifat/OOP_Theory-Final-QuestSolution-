package Ques_2a;

public class Test {
    static int TestA() throws Exception{
        throw new Exception("Exception has been thrown from TestA");
        //System.out.println("Don't forget me!");
        //return 0;
    }
    static void TestB() throws Exception {       // Because TestA has an Exception
        int a = TestA();
        if(a == 0){
            System.out.println("Exception in TestB: a is zero.");
        } else {
            System.out.println("You should figure out the value of a: " + a);
            throw new Exception("Exception from else clause in TestB");
        }
        //return;    // no need of return cz TestB is void type
    }
    static boolean TestC(boolean val) throws Exception {     // New Exception
        if(val == false){
            throw new Exception("Exception in TestC");
        }
        return false;
    }

    public static void main(String[] args) {        //As main method is static, so we need to make all the method static which are called by the main method
        try {
            TestC(false);
        } catch (Exception e) {
            System.out.println(e);
            try {
                TestB();
            }catch (Exception e1) {
                System.out.println(e1);
            }
        }
    }
}
