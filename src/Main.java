import java.util.Scanner;
public class Main {
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);
        String username,password;
        System.out.print("Usurname: ");
        username = input.nextLine();
        System.out.print("Password: ");
        password =input.nextLine();

        if ( username.equals("baybast") && password.equals("baybast123")){
            System.out.println("Basiri ile Giris yapildi...");

        }
        else if (username != ("baybast") && password.equals("baybast123")){
            System.out.print("Kullanici adi yanlis..");
        }
        else if (username.equals("baybast") && password != ("baybast123")) {
             System.out.print("Sifre yanlis...");

        }else {
            System.out.print("Kullanici adi sifre yanlis..");
        }

    }
}