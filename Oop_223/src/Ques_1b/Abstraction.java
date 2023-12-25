package Ques_1b;

abstract class abs {
    abstract public void m1();
    public void m2(){};
}
interface I1{                         // interface in lower case
    public void m3();
    public void m4();
}
interface I2{                        // interface in lower case
    public void m5();
    //public void m6();          // this method should be implemented in main
}
public class Abstraction extends abs implements I1, I2{
    public void m1(){};
    public void m3(){};
    public void m4(){};
    public void m5(){};
}
