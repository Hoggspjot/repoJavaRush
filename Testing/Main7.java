package Testing;

public class Main7 {
    public static void main(String[] args) {

        Parent.staticMethod();
        Child.staticMethod();


    }
}

class Parent {
    public static void staticMethod() {
        System.out.println("Статический метод родителя");
    }
}

class Child extends Parent {
    public static void staticMethod() {
        System.out.println("Статический метод наследника");
    }
}
