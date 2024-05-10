 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = input.next();
        System.out.println("Welcome" + name);
    }
}