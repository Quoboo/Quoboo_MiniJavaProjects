import java.util.Random;

public class randomVal {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(10)+1;

        System.out.println(x);

    }
}
