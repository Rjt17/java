public class method_overloading {
    static void foo(){
        System.out.println("Good morning bro!!!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " you bro!!!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning again bro!!!");
    }

    static void foo(float a){
        System.out.println("Good morning bro in floats");
    }
    public static void main(String[] args) {
        foo();
        foo(2);
        foo(3,4);
        foo(1.0f);
    }
}
