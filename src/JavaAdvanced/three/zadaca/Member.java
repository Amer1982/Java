package JavaAdvanced.three.zadaca;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Member {

    MemberElement[] members;

    public Member(String fileName) throws IOException {
        File myFile = new File(fileName);
        Scanner scan = new Scanner(myFile);

        int numOfLines = 0;
        while (scan.hasNextLine()) {
            scan.nextLine();
            numOfLines++;
        }
        System.out.println("Lines-->" + numOfLines);
        scan.close();

        members = new MemberElement[numOfLines];
        scan = new Scanner(myFile);
        numOfLines = 0;
        while (scan.hasNextLine()) {
            String data[] = scan.nextLine().split(";");
            members[numOfLines] = new MemberElement(data[0], data[1], data[2]);
            System.out.println(members[numOfLines]);
            numOfLines++;
        }
    }

    public static void main(String[] args) throws IOException {

        new Member
                ("C:\\Users\\bnc\\Documents\\IT zadaci\\ITAcademy\\ITakademy 2020\\JavaAdvanced\\person.txt");
    }
}

