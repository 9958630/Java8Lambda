import java.util.Scanner;
import java.util.function.Predicate;

public class MainTest {

 public static void main(String args[]){
  Predicate<String> predicate = x -> x.equalsIgnoreCase("SpringBot");

  Predicate<String> integerPredicate = i -> i.length()>5 && i.length()<20;

  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter you string : ");
  String name = scan.next();

  if(integerPredicate.and(predicate).test(name)){
   System.out.println("Given values matched will process request ");
  }else {
   System.out.println("Given values not matched will not process request ");
  }

  System.out.println("predicate or condition");
  if(integerPredicate.or(predicate).test(name)){
   System.out.println("Given values matched will process request ");
  }else {
   System.out.println("Given values not matched will not process request ");
  }
 }
}
