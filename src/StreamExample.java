import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String ... asdf){

        List<String> stringList = new ArrayList<>();
        stringList.add("spring");
        stringList.add("test");
        stringList.add("boot");
        stringList.add("mong");
        stringList.add("SPRING");
        stringList.add("junit");
        stringList.add("maven");
        stringList.add("Spring");
        stringList.add("spring");

       stringList.stream()
               .filter(name -> name.equalsIgnoreCase("spring"))
               .collect(Collectors.toList())
               .forEach(System.out::println);

       System.out.println("-----------------------------");

        stringList.stream()
                .filter(name -> name.equalsIgnoreCase("spring"))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}
