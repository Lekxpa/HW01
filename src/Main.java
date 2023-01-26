import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Действующие лица: ");
        Human Father = new Human("Van", "Father", "cat");
        System.out.println(Father);
        Animal cat = new Animal("cat", "Мурка", "british");
        System.out.println(cat);
        System.out.println();
        Father.humancall();
        cat.animalAnswer();

        System.out.println();
        System.out.println("_".repeat(20));
        System.out.println("Действующие лица часть 2: ");
        Human Mather = new Human("Vanessa", "Mom", "dog");
        System.out.println(Mather);
        Animal dog = new Animal("dog", "Шарик", "dvorterier");
        System.out.println(dog);
        System.out.println();
        Mather.humancall();
        dog.animalAnswer();

        System.out.println();
        System.out.println("_".repeat(20));
        System.out.println("Действующие лица часть 3: ");
        Human Grandfather = new Human("Captan", "GrandPa", "snack");
        System.out.println(Grandfather);
        Animal snack = new Animal("snack", "Шшшуршун", "cobra");
        System.out.println(snack);
        System.out.println();
        Grandfather.humancall();
        snack.animalAnswer();
    }
}