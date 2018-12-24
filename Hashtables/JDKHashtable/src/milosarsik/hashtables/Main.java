package milosarsik.hashtables;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        Map<String, Employee> hashMap = new HashMap<>();

        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);
        Employee employee = hashMap.put("Doe", mikeWilson);

        System.out.println(employee);

        System.out.println(hashMap.getOrDefault("rand", mikeWilson));

        Iterator<Employee> iterator = hashMap.values().iterator();

        System.out.println(hashMap.containsKey("Doe"));
        System.out.println(hashMap.containsValue(janeJones));

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        hashMap.forEach((k,v) -> System.out.println("Key = " + k + ", Employee = " + v));




    }
}
