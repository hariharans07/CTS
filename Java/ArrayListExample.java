import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.print("Enter number of names: ");
        int n = sc.nextInt(); 
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names.add(sc.nextLine());
        }
        System.out.println("Names: " + names);
        sc.close(); 
    }
}
