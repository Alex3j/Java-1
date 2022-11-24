import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сегодняшнюю дату в формате день/месяц/год(через Enter):");
        int Tday = input.nextByte(); 
        int Tmonth = input.nextByte();
        int Tyear = input.nextShort();
        System.out.print("Введите день рождения: ");
        int day = input.nextByte();
        System.out.print("Введите месяц рождения: ");
        int month = input.nextByte();
        System.out.print("Введите год рождения: ");
        int year = input.nextShort();
        if (day <= 31 && day >= 1) {
            if (month <= 12 && month >= 1) {
                if (Tmonth == month && Tday == day) { //+
                    year = Tyear-year;
                    month = 0;
                    day = 0;
                }
                else if (Tmonth == month && Tday < day) { //+
                    year = Tyear-year-1;
                    month = 11;
                    day = Tday - day + 31;
                }
                else if (Tmonth == month && Tday > day) { //+
                    year = Tyear-year;
                    month = 0;
                    day = Tday - day;
                }
                else if (Tmonth < month && day < Tday) { //+
                    year = Tyear-year-1;
                    month = Tmonth - month + 12;
                    day = Tday - day;
                }
                else if (Tmonth < month && day > Tday) { //+
                    year = Tyear-year-1;
                    month = Tmonth - month + 11;
                    day = Tday - day + 31;
                }
                else if (Tmonth < month && day == Tday) { //+
                    year = Tyear-year-1;
                    month = Tmonth - month + 12;
                    day = 0;
                }
                else if (Tmonth > month && day < Tday) { //+
                    year = Tyear-year;
                    month = Tmonth - month;
                    day = Tday - day;
                }
                else if (Tmonth > month && day > Tday) { //+
                    year = Tyear-year;
                    month = Tmonth - month - 1;
                    day = Tday - day + 31;
                }
                else if (Tmonth > month && day == Tday) { //+
                    year = Tyear-year;
                    month = Tmonth - month;
                    day = 0;
                }
                System.out.println("Лет: "+year+", Месяцев: "+month+", Дней: "+day);
            } 
        }
    }
}