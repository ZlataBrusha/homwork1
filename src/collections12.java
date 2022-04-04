 import java.io.FileNotFoundException;
        import java.io.FileReader;
        import java.io.IOException;
        import java.util.ArrayDeque;
        import java.util.Arrays;
        import java.util.Scanner;

public class collections12 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the path to the file to be read from");
        Scanner scanner1 = new Scanner(System.in);
        String string1 = scanner1.nextLine();
        FileReader reader = new FileReader(string1);
        Scanner scan = new Scanner(reader);
        int number = scan.nextInt();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < number; i++) {
            arrayDeque.add(scan.nextInt());
        }
        Object[] array = arrayDeque.toArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
