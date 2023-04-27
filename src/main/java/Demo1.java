/**
 * 创建一个测试类1
 */
public class Demo1 {
    public static void main(String[] args) {
        // 复杂写法
        MyInterface myInterface1 = new MyInterface() {
            @Override
            public int test(int a, int b) {
                return a + b;
            }
        };
        int test1 = myInterface1.test(1, 2);
        System.out.println(test1);

        /*
         * 1. 将new的过程删除
         * 2. 将Override删除
         * 3. 将方法名删除
         */
        MyInterface myInterface2 = (int a, int b) -> {
            return a + b;
        };

        int test2 = myInterface2.test(2, 3);
        System.out.println(test2);

        /*
         * 只有一个return的时候我们可以省略return
         */
        MyInterface myInterface3 = (int a, int b) -> a + b;

        int test3 = myInterface3.test(3, 4);
        System.out.println(test3);

        /*
         * 调用另一个类中的方法
         */
        MyInterface myInterface4 = (int a, int b) -> MyStatic.add(a,b);

        int test4 = myInterface4.test(5, 6);
        System.out.println(test4);

        /*
         * 参数多余，直接简化用 ::
         */
        MyInterface myInterface5 = MyStatic::add;

        int test5 = myInterface5.test(7, 8);
        System.out.println(test5);
    }
}



