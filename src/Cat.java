import java.util.ArrayList;

public class Cat {

    //attributes describe the cat
    private String name;
    private String color;
    private boolean cuteCat = true;
    private int age;
    private boolean adoptedCat;
    private String owner = "I am the owner of the cat.";
    private ArrayList<String> toys = new ArrayList<>();
    public static int catCount = 0;

    //constructor public/ privated/ protected
    public Cat(String name, String color, int age, boolean adoptedCat){
        this.name=name;
        this.color=color;
        this.age=age;
        this.adoptedCat=adoptedCat;
        Cat.catCount+=1;
    }

    public Cat(String name, String color, int age, boolean adoptedCat, String owner){
        this(name, color, age, adoptedCat);
        this.owner=owner;
    }




    //methods describe what the cat does

    //getter for the name
    public String getName(){
        return this.name;
    }
    //setter for the name
    public void setName(String name){
        this.name=name;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public boolean getCuteCat(){
        return this.cuteCat;
    }
    public void setCuteCat(boolean cuteCat){
        this.cuteCat=cuteCat;
    }
    public boolean getAdoptedCat(){
        return this.adoptedCat;
    }
    public void setAdoptedCat(boolean adoptedCat){
        this.adoptedCat=adoptedCat;
    }
    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String owner){
        this.owner=owner;
    }


    //static methods
    public static int getCatCount(){
        return Cat.catCount;
    }


    public void giveToy(String toy){
        this.toys.add(toy);
        System.out.printf("%s now has the following toys: %n", this.name);
        for (String t: this.toys){
            System.out.println(t);
        }
    }
}
