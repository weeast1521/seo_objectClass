import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("몇개의 수를 입력할 예정인가요? ");

        int num = sc.nextInt();
        Integer[] arr = new Integer[num];

        System.out.printf("수를 입력하세요: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(sc.next());
        }

        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);
    }
}