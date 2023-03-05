import java.util.function.Function;

public class FunctionExamples {

    public static void main(String args[]){
        Function<Integer,String> function = (a) ->  String.valueOf(a);
        System.out.println(function.apply(1));

        Function<String,Integer> funcitonStringlen = s -> s.length();
        Function<Integer,Integer> functionLenMul = i -> i*2;

        System.out.println(funcitonStringlen.andThen(functionLenMul).apply("SpringBoot"));
    }
}
