package JavaCore.Predavanje3;
/*
Potrebno je kreirati program za prikaz nivoa pristupa korisnika
• Prilikom startovanja aplikacije, korisnik mora da unese svoj nivo pristupa
(1,2 ili 4)
• Nakon unosa program prikazuje da li kojim nivoima korisnik ima pristup a
kojima ne ako su nivoi korisnika (regular=1, admin=2, superadmin = 4)
 */
import java.util.Scanner;

public class Vjezba1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Molimo unesite Vas nivo pristupa: 1,2 ili 4");
        int pristup = sc.nextInt();
        int Regular = 1;
        int Admin = 2;
        int SuperAdmin = 4;
        System.out.println("Regular level is: "+(pristup==Regular));
        System.out.println("Admin level is: "+(pristup==Admin));
        System.out.println("SuperAdmin level is: "+(pristup==SuperAdmin));
    }
}
