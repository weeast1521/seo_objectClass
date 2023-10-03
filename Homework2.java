import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        class Student {
            Student(){
                System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            }
            int studentId;
            String studentName;
            String Major;
            int phoneNumber;
            String strPhoneNumber;
            String allInformation;
            void getInformation() {
                studentId = sc.nextInt();
                studentName = sc.next();
                Major = sc.next();
                phoneNumber = sc.nextInt();
            }
            void setPhoneNumber() {
                strPhoneNumber = Integer.toString(phoneNumber);
                strPhoneNumber = "0" + strPhoneNumber.substring(0,2) + "-" +
                        strPhoneNumber.substring(2,6) + "-" + strPhoneNumber.substring(6,10);
                allInformation = studentId + " " + studentName + " " + Major + " " + strPhoneNumber;
            }
        }

        Student[] arr = new Student[3];
        arr[0] = new Student();
        arr[0].getInformation();
        arr[0].setPhoneNumber();
        arr[1] = new Student();
        arr[1].getInformation();
        arr[1].setPhoneNumber();
        arr[2] = new Student();
        arr[2].getInformation();
        arr[2].setPhoneNumber();

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.println("첫번째 학생: " + arr[0].allInformation);
        System.out.println("두번째 학생: " + arr[1].allInformation);
        System.out.println("세번째 학생: " + arr[2].allInformation);
    }
}
