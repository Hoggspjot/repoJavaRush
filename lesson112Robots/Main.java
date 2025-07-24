package lesson112Robots;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Robot> list = List.of(
                new Worker(),
                new Manager(),
                new Teacher()
        );


        for (Robot bilder : list) {
            if (bilder instanceof WallBilder) {
                ((WallBilder) bilder).BuildWall();
                ((WallBilder) bilder).angering();
                bilder.makeSound();

            }
        }

        Map<Integer,String> map = list.stream()
                .collect(Collectors.toMap(
                        robot -> robot.getName().length(),
                        Robot::getName,
                        (name1, name2) -> name1
                        )
                );
        System.out.println(map);

        Map<Integer, List<String>> map2 = list.stream()
                .collect(Collectors.groupingBy(
                        robot -> robot.getName().length(),
                       Collectors.mapping(Robot::getName, Collectors.toList())
                ));
        System.out.println(map2);
    }
}



interface WallBilder extends Robot {
    void BuildWall();

    private void anger() {
        System.out.println("Grrr, hate working!!");
    }

    default void angering() {
        anger();
    }

}

interface Robot {

    String default_sound = "beep";

    default void makeSound() {
        System.out.println(default_sound);
    }


    String getName();
}






class Worker implements WallBilder,Robot {

    private static final String NAME = "Bob";

    @Override
    public void BuildWall() {
        System.out.println("Build wall");
    }

    @Override
    public String getName() {
        return NAME;
    }
}

class Manager implements WallBilder, Robot {

    private static final String NAME = "Jon";

    @Override
    public void BuildWall() {
        System.out.println("Manager build wall");
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void makeSound() {
        System.out.println("Менеджер пошел работать");
    }
}

class Teacher implements Robot{

    private static final String NAME = "Miguel";

    @Override
    public String getName() {
        return NAME;
    }
}

