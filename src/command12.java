import java.util.Scanner;

public class command12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commandAndArgs = scanner.nextLine();
        String[] strings = commandAndArgs.split(" ", 0);
        //String [] strings = commandAndArgs.split(" ");
        if (strings[0].equals("hello")) {
            System.out.println("hello, " + strings[1]);
            // System.out.print("hello, ");
            // for (int i = 1; i < strings.length; i++) {
            //System.out.print(strings[i]+ " ");
        }

    }
}


