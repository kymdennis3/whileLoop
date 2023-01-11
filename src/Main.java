import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //while loop - executes a block of code as long as its condition remain true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        do {
            name = scanner.nextLine();
        }
            while(name.isBlank());
            System.out.print("Hello " + name);

        }
    }
