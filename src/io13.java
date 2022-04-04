import java.io.FileNotFoundException;
        import java.io.*;
        import java.util.Scanner;

public class io13 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the path to the file to be read from");
        Scanner scanner1= new Scanner(System.in);
        FileReader reader = new FileReader(scanner1.nextLine());
        Scanner scan = new Scanner(reader);
        int max = 0;
        String maxName = null;
        String moment = null;
        while (scan.hasNext())
        {moment = scan.nextLine();
            if (moment.length()>max){
                max = moment.length();
                maxName = moment;
            }
        }
        System.out.println(maxName);
    }
}
