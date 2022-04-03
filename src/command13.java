import java.util.Scanner;

import static java.lang.System.in;

public class command13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(in);
        String [] strings=scanner.nextLine().split(" ");
        int count = 0;
        if(strings[0].equals("repeat")) {
         try {
             count = Integer.parseInt(strings[strings.length - 1]);
         }catch (NumberFormatException e) {
             System.err.println("please, enter positive and  integer number, thanks;)repea");
         }
            for (int i = 0; i < count; i++) {
                for (int k = 1; k < strings.length - 1; k++) {
                    System.out.print(strings[k] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
