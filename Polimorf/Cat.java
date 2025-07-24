package Polimorf;


public class Cat {
    public void run(){
        System.out.println("I can Run");
    }
}


class Tiger extends Cat {
    public void run(){
        System.out.println("I can run with 40 km\\h");
    }
}

class Lion extends Cat{
    public void run(){
        System.out.println("I can run with 30 km\\h");
    }
}

class Doctor{
    public void helth (Cat cat){
        System.out.println(cat + " Is live!");
        cat.run();
    }
}

class main{
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Doctor doctor = new Doctor();

        doctor.helth(tiger);
        doctor.helth(lion);
    }
}
