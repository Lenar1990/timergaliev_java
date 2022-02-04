import java.util.Scanner;
public class Solution2 {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя");
        Scanner Scanner = new Scanner(System.in);
        String a = Scanner.nextLine();
        Scanner.close();
        String b = "Вячеслав";
        if (a.equals(b)) {
            System.out.println("Привет," + b);
            }
        else {
            System.out.println("Нет такого имени");
            }
        }
}
