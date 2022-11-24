import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите чиcло: ");
        int num = input.nextInt();
        System.out.print("Введите степень: ");
        byte power = input.nextByte();
        double res = 1;
        if (power >= 1) {
            for (int i = 1; i <= power; i++) {
                res *= num;
            }
        }
        if (power <= 1) {
            while (power < 0) {
                res /= num;
                power ++;
            }
        }
        System.out.println(res);
    }
}