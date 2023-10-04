import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class coolScannerTop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Dude, what's ur Name?");
        String Name = scanner.nextLine();
        System.out.println(Name + " is a very cool name!");

        System.out.println("How old are u?");
        int Age = scanner.nextInt();
        System.out.println(Age + "?! Thats a nice age, young man!");
    }

}