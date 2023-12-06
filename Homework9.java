import java.io.File;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
class Login2{
    Scanner sc = new Scanner(System.in);
    private String id = "id";
    private String pw = "password";
    private int login = 0;
    Map<String, String> lg = new HashMap<String, String>(){
        {
            try{
                Scanner sc = new Scanner(new File("db.txt"));
                while (sc.hasNext()){
                    String a = sc.next();
                    String b = sc.next();
                    put(a,b);
                }
                sc.close();
            }catch (Exception e){ e.printStackTrace();}
        }
    };
    public void LoginSystem(){
        while(login != 1)
        {
            System.out.println("id와 password를 입력해주세요.");
            System.out.printf("id : ");
            id = sc.next();
            if(lg.containsKey(id)){
                System.out.printf("password : ");
                pw = sc.next();
                if(pw.equals(lg.get(id))){
                    System.out.println("id와 비밀번호가 일치합니다.");
                    login = 1;
                }
                else{
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                }
            }
            else{
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            }
        }
    }
}
public class Homework9 {
    public static void main(String[] args) {
        Login2 lg = new Login2();
        lg.LoginSystem();
    }
}
