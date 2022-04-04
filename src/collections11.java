
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class collections11 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the path to the file to be read from");
        Scanner scanner1 = new Scanner(System.in);
        String name1 = scanner1.nextLine();
        System.out.println("Enter the path to the file in which numbers will be written");
        Scanner scanner2 = new Scanner(System.in);
        String name2 = scanner2.nextLine();
        FileReader reader = new FileReader(name1);
        PrintWriter writer = new PrintWriter(name2);
        Scanner scan = new Scanner(reader);
        Stack<Integer> stack = new Stack<>();
        while (scan.hasNext()) {
            int number = scan.nextInt();
            while (number !=0){
                stack.push(number);
            }
        }
        reader.close();
        while (stack.size() != 0) {
            Integer a = stack.pop();
            writer.println(a);
        }
        writer.close();
    }
}
