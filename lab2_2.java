import java.util.Scanner;
public class lab2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        boolean strength = password.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])[0-9a-zA-Z_]{8,}$");
        if (strength==false) {
        while (strength==false) {
            System.out.println("Пароль ненадежен. Повторите ввод");
            password = input.nextLine();
            strength = password.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])[0-9a-zA-Z_]{8,}$");
        }
    }
        if (strength==true)
            System.out.println("Пароль надежен");
    }
}