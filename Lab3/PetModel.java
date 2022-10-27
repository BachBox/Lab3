package Lab3;

import java.util.*;

public class PetModel {
    Scanner sc = new Scanner(System.in);

    Pet x = new Pet(1, "Chihu", 10, "Mexico", "Female", Type.DOG, "x", "x");
    Pet y = new Pet(2, "Ngao", 2, "Tay Tang", "Male", Type.DOG, "Big", "here");
    Pet z = new Pet(3, "Becgie", 3, "Germany", "Male", Type.DOG, "Strong", "there");
    Pet t = new Pet(4, "Pitbull", 5, "America", "Female", Type.DOG, "fierce", "this");
    Pet x2 = new Pet(1, "Chihu", 10, "Mexico", "Female", Type.CAT, "x", "x");
    Pet y2 = new Pet(2, "Ngao", 2, "Tay Tang", "Male", Type.CAT, "Big", "here");
    Pet z2 = new Pet(3, "Becgie", 3, "Germany", "Male", Type.CAT, "Strong", "there");
    Pet t2 = new Pet(4, "Pitbull", 5, "America", "Female", Type.CAT, "fierce", "this");
    List<Pet> pets = new ArrayList<>(Arrays.asList(x, y, z, t, x2, y2, z2, t2));

    public Pet inputAPet(Scanner sc) {
        System.out.println("Input pet info: ");
        System.out.println("Input id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Input pet name: ");
        String name = sc.nextLine();
        System.out.println("Input pet's age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Input pet's species: ");
        String species = sc.nextLine();
        System.out.println("Input pet's sex: ");
        String sex = sc.nextLine();
        System.out.println("Input pet's type: CAT or DOG): ");
        Type type;
        if (sc.nextLine().equalsIgnoreCase("cat"))
            type = Type.CAT;
        else
            type = Type.DOG;
        System.out.println("Input image: ");
        String image = sc.nextLine();
        return new Pet(id, name, age, species, sex, type, species, image);
    }

    public void match() {
        Pet inputPet = inputAPet(sc);
        while (true) {
            int pos = new Random().nextInt(pets.size());
            if (pets.get(pos).getType().equals(inputPet.getType()) && !inputPet.getSex().equalsIgnoreCase(pets.get(pos).getSex())) {
                System.out.println(pets.get(pos));
                System.out.println("Do you wanna find another pet? Type Y/N");
                if (sc.nextLine().equalsIgnoreCase("n"))
                    break;
            }
        }
    }
}
