import java.util.ArrayList;
import java.util.List;

public class StreamForLoop {

    public static void main(String ... args){
        List<String> stringList = new ArrayList<>();
        stringList.add("spring");
        stringList.add("test");
        stringList.add("boot");
        stringList.add("mong");
        stringList.add("junit");
        stringList.add("maven");

        System.out.println("Formal Loop ");
        for(int i =0; i<stringList.size();i++){
            System.out.println(stringList.get(i));
        }
        System.out.println("===========================for-each Loop ");
        for(String obj : stringList){
            System.out.println(obj);
        }
        System.out.println("=========================== streams ");
        stringList.stream().forEach(System.out::println);

    }
}
