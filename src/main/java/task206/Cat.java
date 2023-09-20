package task206;
import java.util.Arrays;
import java.util.List;

class Animal {

}

public class Cat extends Animal{
    String name;

    private static Cat renameCat(Cat cat) {
        System.out.print(cat.name);
        cat = new Cat();
        cat.name = "Mia";
        return cat;
    }


    public static void main(String[] args) {
        List<String> catNames = Arrays.asList("Mira", "Aisa");
        catNames.add("Jiko");
        System.out.println(catNames);
    }
}