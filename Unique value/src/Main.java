import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String inputValues = " ";
        String input = " ";

        System.out.println("Введите занчения массива, для завершения ввода, введите exit");

        while(true){
            input = in.nextLine();
            if(input.equals("exit"))
                break;
            else
            inputValues += (input + " ");
        }

        String[] values = inputValues.split(" ");

        System.out.println("Введёный массив: ");
        for (String i:values) {
            System.out.print(i + " ");
        }
        HashSet<String> sortedValues = new HashSet<String>();
        Collections.addAll(sortedValues, values);

        System.out.println();
        System.out.println("Отсортированный массив: ");
        for (Object i:sortedValues) {
            System.out.print(i + " ");
        }
    }
}
