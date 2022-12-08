import java.util.Scanner;
public class lab2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String date = input.nextLine();
        boolean result = date.matches("^(0?[1-9]|[12][0-9]|3[0-1])/(0?[13578]|1[02])/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])$|^(0?[1-9]|[12][0-9]|30)/(0?[469]|11)/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])$|^(0?[1-9]|[12][0-8])/(0?2)/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])$");
        boolean result2 = date.matches("^(0?[1-9]|[12][0-9]|3[0-1])\\.(0?[1-9]|1[012])\\.(19[0-9][0-9]|[2-9][0-9][0-9][0-9])$");
        if (result == false && result2 == true)
            System.out.println("Введенное выражение не соответсвует формату");
        else if (result == true && result2 == false)
            System.out.println("Введенное выражение является датой");
        else if (result == false && result2 == false)
            System.out.println("Введенное выражение не является датой");
        System.out.println(result);
        System.out.println(result2);
    }
}

//"^(0?[1-9]|[12][0-9]|3[0-1])/(0?[13578]|1[02])/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])$||^(0?[1-9]|[12][0-9]|30)/(0?[469]|11)/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])$||^(0?[1-9]|[12][0-8])/(0?2)/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])$"