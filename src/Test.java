public class Test implements  Addition{
    public static void main(String ... hi) {
   /*     Addition addition = (p,q) -> System.out.println(p+q);
        Addition sub = (a,b) -> System.out.println(a-b);
        Addition mul = (a,b) -> System.out.println(a*b);
        addition.cal(10,20);
        sub.cal(20,10);
        mul.cal(5,4);*/
        Test t = new Test();
        t.m1(25);
    }


    @Override
    public void cal(Integer a, Integer b) {

    }

    @Override
    public void m1(int a) {
       Addition.super.m1(a);
    }
}


