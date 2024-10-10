
/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if(!(obj instanceof Iphone))
            return false;

        Iphone iphone = (Iphone) obj;

        boolean  x = false, y = false, z = false;

        if (this.price == iphone.price)
            x = true;
        if (this.model != null && this.model.equals(iphone.model))
            y = true;
        if (this.color != null && this.color.equals(iphone.color))
            z = true;
        if (x == true & y == true & z == true)
            return true;
        else
            return false;
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
