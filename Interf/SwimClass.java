package Interf;

public class SwimClass implements Swimmble, fly {
    @Override
    public void swim() {
        System.out.println("Уточка плыви");
    }

    @Override
    public void fly() {
        System.out.println("I belive i can flyyyy");
    }
}

class main{
    public static void main(String[] args) {
        SwimClass duck = new SwimClass();
        duck.swim();
        duck.fly();
    }
}


