import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String:- ");
        String name = scan.nextLine();
        System.out.println(name);

        System.out.println("String Substring");
        System.out.println("Substring will print the string till begin from startIndex and will print till endIndex - 1");
        String substring = name.substring(2, 7);
        System.out.println(substring);

        System.out.println("String length");
        int length = name.length();
        System.out.println("The length of string " + name + " is: " + length);
    }
}
