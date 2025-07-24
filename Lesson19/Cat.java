package Lesson19;

public class Cat {

    private String name;
    private int age;
    private int weight;


    Cat(String name, int age, int weight){
        if(name instanceof String) {
            this.name = name;
        }else
            System.out.println("ВВеди нормальное имя");
        if(age >= 0) {
            this.age = age;
        }else
            System.out.println("Возраст от 0 и больше!");
        if(weight > 0) {
            this.weight = weight;
        }else
            System.out.println("Вес должен быть полжительный");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name instanceof String)
            this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 0)
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >=0)
        this.age = age;
    }
}

class  Main{
    public static void main(String[] args) {
        Cat cat = new Cat("dqwd",-10, 0);
        System.out.println(cat.getAge());
        System.out.println(cat.getWeight());
        cat.setAge(-11);
        System.out.println(cat.getAge());
    }
}



