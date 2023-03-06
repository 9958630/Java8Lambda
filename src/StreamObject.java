import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamObject {

    public static void main(String ... args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee();
        employee.setEmpName("bala");
        employee.setEmpNo("123");
        employeeList.add(employee);

        Employee employee1 = new Employee();
        employee1.setEmpName("kumar");
        employee1.setEmpNo("987");
        employeeList.add(employee1);

        Employee employee2 = new Employee();
        employee2.setEmpName("ravi");
        employee2.setEmpNo("1001");
        employeeList.add(employee2);

        Employee employee3 = new Employee();
        employee3.setEmpName("bala");
        employee3.setEmpNo("9999");
        employeeList.add(employee3);

        Optional<Employee> emp = employeeList.stream().filter(e -> e.getEmpNo().equalsIgnoreCase("9999")).findFirst();
        if(emp.isPresent()){
            System.out.println("employee present:"+emp.get().toString());
        }

        System.out.println("Map examples--------------------------------");
       employeeList.stream().map(Employee::getEmpNo).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Map examples with filter--------------------------------");
        Optional<String> empNo = employeeList.stream().map(Employee::getEmpNo).filter(s->s.equalsIgnoreCase("9999")).findAny();
        System.out.println("empNO : "+empNo.get());

        System.out.println("Filter examples with Map--------------------------------");

        employeeList.stream()
                .filter(e -> e.getEmpName().equalsIgnoreCase("bala"))
                .map(Employee::getEmpNo).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Count Example --------------------------------");
        System.out.println("Count : "+employeeList.stream().count());

        System.out.println("Max Example --------------------------------");
        System.out.println("Max : "+employeeList.stream().map(Employee::getEmpNo).max((p,q)-> p.compareTo(q)).get());

        System.out.println("Min Example --------------------------------");
        System.out.println("Min : "+employeeList.stream().map(Employee::getEmpNo).min((p,q)-> p.compareTo(q)).get());

        Set<Employee> setEmp = employeeList.stream().collect(Collectors.toSet());

        System.out.println("pagination :");
       List<String> listmep =  employeeList.stream().skip(2).limit(2).map(Employee::getEmpNo).collect(Collectors.toList());
       listmep.forEach(System.out::println);

       //flatMap : map map













    }
}
