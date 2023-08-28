package main1.java1;
public class son extends Grandfather{
    String name;
    son(String nationlity,String name,String surname){
        this.name=name;
        this.nationality=nationlity;
        this.surname=surname;
    }
    void disply(){
        System.out.println(nationality);
        System.out.println(surname);
        System.out.println(name);
    }
}
