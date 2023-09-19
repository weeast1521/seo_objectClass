import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc_seo = new Scanner(System.in);

        int sum = 0;
        int arr[] = new int[5];
        for(int i=0; i<=4;i++){
            System.out.printf("정수를 입력하세요: ");
            arr[i] = sc_seo.nextInt();

            sum = sum + arr[i];
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.", sum); // println 쓰면 왜 안돼>??
            System.out.println();
        }
    }
}
