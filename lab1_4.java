import java.util.Scanner;
public class Fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите чиcло точек: ");
        int num = input.nextInt();
        System.out.print("Введите радиус: ");
        int R = input.nextInt();
        int count = 0;
        for (int i=1; i<=num; i++) {
            System.out.print("Введите X"+i+": ");
            double x = input.nextDouble();
            System.out.print("Введите Y"+i+": ");
            double y = input.nextDouble();
            if (x*x + y*y <= R) {
                count += 1;
            }
        }
        System.out.print(count);
    }
}