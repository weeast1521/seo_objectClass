import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
class Login{
    Scanner sc = new Scanner(System.in);
    private String id = "id";
    private String pw = "password";
    private int login = 0;
    Map<String, String> lg = new HashMap<String, String>(){
        {
            put("myld", "myPass");
            put("myld2", "myPass2");
            put("myld3", "myPass3");
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
public class Homework8 {
    public static void main(String[] args) {
        Login lg = new Login();
        lg.LoginSystem();
    }
}
