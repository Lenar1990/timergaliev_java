import java.util.Arrays;
import java.util.Scanner;
class Solution3 {
    public static void main(String[] args) {
        System.out.println("Введите числовой массив");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        String[] strArr = str.split(" ");
        int[] arr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
            if (arr[i]%3==0) {
                System.out.print(arr[i] + " ");
                }
            }
        }
}