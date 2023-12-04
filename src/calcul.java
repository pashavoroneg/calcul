import javax.swing.*;
import java.util.Scanner;
public class calcul {
    public static String calcul () {

            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            System.out.println("input:");
            String[] array = input.split(" "); //разделитель


            int z;                                          // int masiv
            z = Integer.parseInt(array[0]);
            int c;
            c = Integer.parseInt(array[2]);
            int b = 0;



            if (array.length > 3) {
                System.out.println("output:");
                throw new RuntimeException("операция не совпадает с заданием ");
            }
            try {

                if (array[1].equals("+")) {
                    b = z + c;
                } else if (array[1].equals("-")) {
                    b = z - c;
                } else if (array[1].equals("*")) {
                    b = z * c;
                } else if (array[1].equals("/")) {
                    b = z / c;
                } else {
                    System.out.println("Output:");
                }

            } catch (ArrayIndexOutOfBoundsException r) {
                System.out.println("Output:");
                throw new RuntimeException("т.к. строка не является математической операцией");
            } catch (NumberFormatException e) {
                System.out.println("output:");
                throw new RuntimeException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }

            String result;
            result = Integer.toString(b);

            System.out.println("output:");
            System.out.println(result);


            return result;
    }

    public static void main(String[] args) {
        calcul();

    }
}



