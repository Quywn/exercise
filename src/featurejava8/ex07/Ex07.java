package featurejava8.ex07;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Cho một danh sách các đối tượng Person, hãy chuyển danh sách này thành một Map với key là name và value là đối tượng Person.
//Nếu có các key trùng lặp, hãy xử lý bằng cách giữ lại đối tượng đầu tiên.
public class Ex07 {
    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();
        Person person1 = new Person("A", 12);
        Person person2 = new Person("A", 13);
        Person person3 = new Person("C", 14);
        Person person4 = new Person("D", 15);
        Person person5 = new Person("D", 16);
        Person person6 = new Person("F", 17);
        List<Person> persons = Arrays.asList(person1, person2, person3, person4, person5, person6);
        for (Person person : persons) {
            map.putIfAbsent(person.getName(), person);
        }
        System.out.println(map);
    }
}
