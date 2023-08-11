import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = arr[1]; i < size; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.print("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}