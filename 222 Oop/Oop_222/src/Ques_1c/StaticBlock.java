package Ques_1c;

public class StaticBlock {
        public static int a = 5, b;
        public static int c;      // c must be static for next static block
        static {
            b = c * 4;
        }
        static {
            c = 5;
        }
        public static void main(String[] args) {
            new StaticBlock();
        }
}

class point{
    public int x, y, z;
    public point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
class FinalCheck {
    public static final point p = new point(1, 2, 3);
    public void FinalExam(){       // need data type that is void
        System.out.println("Final is both exam and keyword");
    }
    public static void check(){
        p.x = 3;
        p.y = 4;
        //p = new point(2, 3, 4);           // object p is already final
    }
    public static void main(String[] args) {
        check();
    }
}
