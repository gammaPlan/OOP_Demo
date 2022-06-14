public class Vet {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Jessy",
                "white",
                2,true,"Angela");
        cat1.setName("Test");
        System.out.println(cat1.getOwner());
        Cat cat2 = new Cat("Skippy",
                "black",
                1,true,"Endi");
        Cat cat3 = new Cat("Jon",
                "brown",
                3,true,"Elton");
        System.out.println(Cat.getCatCount());
        cat2.giveToy("ball");
    }
}