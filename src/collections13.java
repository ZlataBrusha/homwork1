
import java.io.*;
import java.util.*;


    public class collections13 {
        public static void main(String[] args) throws IOException {
            System.out.println("Enter the path to the file to be read from");
            Scanner scanner1 = new Scanner(System.in);
            String string1 = scanner1.nextLine();
            System.out.println("Enter the path to the file in which numbers will be written");
            Scanner scanner2 = new Scanner(System.in);
            String string2 = scanner2.nextLine();
            FileReader reader = new FileReader(string1);
            PrintWriter writer = new PrintWriter(string2, "UTF-8");
            Scanner scan = new Scanner(reader);
            LinkedList<Integer> list = new LinkedList<>();
            int c;
            while (scan.hasNext()) {
                int number = scan.nextInt();
                while (number !=0){
                    list.add(number);
                }
            }
            while (list.size() != 0) {
                writer.println(list.peekLast());
            }
            writer.close();
        }
    }

