import models.Mammalia;

public class Main {
    public static void main(String[] args) {

        Mammalia cow = new Mammalia("cow1", "");
        cow.getHello();

        Mammalia dog = new Mammalia("dog1","");
        dog.getHello();

        System.out.println(cow.type);
        System.out.println(dog.type);

    }
}