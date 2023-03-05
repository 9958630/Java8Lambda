import java.util.Scanner;
import java.util.function.BiFunction;

public class BiFunctionExamples {

    public static void main(String ... args) {
        BiFunction<Integer,Integer,Integer> addition = (a,b) -> (a+b);
        BiFunction<Integer,Integer,Integer> sub = (a,b) -> (a-b);
        BiFunction<Integer,Integer,Integer> mul = (a,b) -> (a*b);
        BiFunction<Integer,Integer,Integer> div = (a,b) -> (a/b);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first value :");
        int first = scanner.nextInt();
        System.out.println("Please enter second value :");
        int second = scanner.nextInt();
        System.out.println("Please select you operation : ");
        String val = scanner.next();

        switch (val){
            case "add": System.out.println(addition.apply(first,second));
            break;
            case "sub": System.out.println(sub.apply(first,second));
                break;
            case "mul": System.out.println(mul.apply(first,second));
                break;
            case "div": System.out.println(div.apply(first,second));
                break;
        }
    }

}
