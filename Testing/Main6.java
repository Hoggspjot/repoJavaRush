package Testing;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {


        List<String> list = Arrays.asList("hello", "world", "hi");

        Map<Integer, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.mapping(s -> s.toUpperCase(), Collectors.toList())));

        System.out.println(map);


        List<Person> people = Arrays.asList(
                new Person("Vova", 30),
                new Person("Sahsa", 35),
                new Person("Nika", 30),
                new Person("Serge", 35),
                new Person("Vik", 45)
        );


        Map<Integer, List<String>> map2 = people.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(s -> s.getName(), Collectors.toList())));

        System.out.println(map2);

        for (Map.Entry<Integer, List<String>> entry : map2.entrySet()) {
            System.out.println("Людей с возрастом " + entry.getKey() + " количество - "+entry.getValue().size()+"\n" +"Их имена - " + entry.getValue());
        }


    }
}

class Person{
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
