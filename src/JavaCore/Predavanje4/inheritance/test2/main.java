package JavaCore.Predavanje4.inheritance.test2;

import com.sun.corba.se.impl.ior.ObjectAdapterIdArray;

public class main {
    public static void main(String[] args) {
        Person o = new Person("Amer", "Jahjefendic", 38, 186, 82, "tamno smeda");
        o.show();
        Person o2 = new Person("Aida", "Popovac-Jahjefendic",37,154,54.2,"braun");
        o2.show();
        System.out.println("Ja sam "+o2.ime+ " "+o2.prezime+" i volim svog muza najvise na svijetu");
    }
}
