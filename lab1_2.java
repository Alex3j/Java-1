import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите чиcло: ");
        int day = input.nextInt();
        System.out.print("Введите месяц: ");
        int month = input.nextInt();
        if (month <= 12 && month >= 1) {
            if (day <= 29 && day >= 1) {
                switch (month) {
                    case 1:
                    case 2:
                    case 12:                   
                        System.out.println("Winter");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Spring");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Summer");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Autumn");
                        break;
                }
            }
            else if (day == 30) {
                switch (month) {
                    case 4:
                        System.out.println("Spring");
                        break;
                    case 6:
                        System.out.println("Summer");
                        break;
                    case 9:
                    case 11:
                        System.out.println("Summer");
                        break;
                }
            }
            else if (day == 31) {
                switch (month) {
                    case 1:
                    case 12:                   
                        System.out.println("Winter");
                        break;
                    case 3:
                    case 5:
                        System.out.println("Spring");
                        break;
                    case 7:
                    case 8:
                        System.out.println("Summer");
                        break;
                    case 9:
                    case 11:
                        System.out.println("Autumn");
                        break;
                }
            }
        }
    }
}