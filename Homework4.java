import java.util.Scanner;
class GCD{
    int gcd(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) return gcd(a - b, b);
        else return gcd(a, b - a);
    }
}
class LoopGCD{
    int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a; // 또는 b를 반환해도 됩니다. 두 값은 서로 같아집니다.
    }

}
class TestGCD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GCD gcd1 = new GCD();
        LoopGCD gcd2 = new LoopGCD();

        System.out.print("두 수를 입력하세요: ");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        System.out.println("두 수의 최대공약수는 " + gcd1.gcd(m1,n1) + "입니다.");

        System.out.print("두 수를 입력하세요: ");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("두 수의 최대공약수는 " + gcd2.gcd(m2,n2) + "입니다.");
    }
}