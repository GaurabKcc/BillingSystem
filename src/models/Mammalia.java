package models;

public class Mammalia {

    public int noOfChambers = 4;
    public boolean hairy_body =true;
    public  String name;
    public String type;

    public Mammalia(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void getHello(){
        System.out.println("Hello There!");
    }

    public void getBye(){
        System.out.println("Alr byee");
    }
}
