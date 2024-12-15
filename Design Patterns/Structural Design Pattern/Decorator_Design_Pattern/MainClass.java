import java.util.Scanner;

public class MainClass {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BasePizza basePizza = null;
        basePizza = MainMenu(basePizza);
        if (basePizza != null) {
            System.out.println("The Cost of the Pizza is : " + basePizza.cost());
        }
        else{
            System.out.println("Good Bye !!!");
        }
        sc.close();
    }

    private static BasePizza MainMenu(BasePizza basePizza) {
        int choice;
        while (true) {
            System.out.println(
                    "--------- Menu ----------\n1. Margherita\n2. VegDelight\n3. FarmHouse\n4. Exit\n-------------------------------------");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    basePizza = new Margherita();
                    basePizza = ToppingMenu(basePizza);
                    return basePizza;

                case 2:
                    basePizza = new VegDelight();
                    basePizza = ToppingMenu(basePizza);
                    return basePizza;

                case 3:
                    basePizza = new FarmHouse();
                    basePizza = ToppingMenu(basePizza);
                    return basePizza;

                case 4:
                    return basePizza;

                default:
                    System.out.println("Invalid Choice !!!");
            }
        }
    }

    private static BasePizza ToppingMenu(BasePizza basePizza) {
        int choice;
        Boolean check = true;
        while (check == true) {
            System.out.println(
                    "--------- Add Toppings ----------\n1. Mushroom\n2. ExtraCheese\n3. Exit\n-------------------------------------");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    basePizza = new Mushroom(basePizza);
                    break;

                case 2:
                    basePizza = new ExtraCheese(basePizza);
                    break;
                
                case 3:
                    check = false;
                    break;
                
                default:
                    System.out.println("Invalid choice !!!");
            }
        }
        return basePizza;
    }
}
