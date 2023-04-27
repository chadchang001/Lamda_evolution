public class Demo {


    public static void main(String[] args) {
//        MyInterface myInterface = new MyInterface() {
//            @Override
//            public int test(int a, int b) {
//                return a+b;
//            }
//        };

//        MyInterface myInterface = a->a;

        MyInterface myInterface1 = (int a, int b) ->
                MyStatic.add(a,b);



        MyInterface myInterface = (a,b) -> { return MyStatic.add(a,b);};
        MyInterface myInterface2 =MyStatic::add;


        int test = myInterface.test(1,2);
        System.out.println(test);
    }



}

class MyStatic {
    static int add(int x, int y) {
        return x + y;
    }
}

@FunctionalInterface
interface MyInterface {
    int test(int a,int b);
}