import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //while loop - executes a block of code as long as its condition remain true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            name = scanner.nextLine();
            System.out.print("Hello " +name);

        }
    }
}