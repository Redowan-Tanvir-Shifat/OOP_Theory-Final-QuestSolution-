package Ques_1b;

public interface A {
    public int p();
    public int q();
}
interface B {
   public int x();
    public int y();
}
abstract class C {
    public abstract int z();
}
class D extends C {
    public int p() {
        System.out.println("");
        return 0;
    }
    public int q() {
        System.out.println("q");
        return 0;
    }
    public int x() {
        System.out.println("x");
        return 0;
    }
    public int y() {
        System.out.println("y");
        return 0;
    }
    public int z() {
        System.out.println("z");
        return 0;
    }
}
