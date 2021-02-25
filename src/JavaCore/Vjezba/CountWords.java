package JavaCore.Vjezba;

import java.util.Scanner;

/**
 * Write a Java program to count the letters, spaces, numbers and other characters of an input string.
 */
public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Molimo unesite zeljenu recenicu:");
        String test = sc.nextLine();
        count(test);
    }
    public static void count(String x){
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for(int i = 0; i < x.length(); i++){
            if(Character.isLetter(ch[i])){
                letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
            else{
                other ++;
            }
        }
        System.out.println("Vasa recenica sadrzi:");
        System.out.println("slova: " + letter);
        System.out.println("razmaka: " + space);
        System.out.println("brojeva: " + num);
        System.out.println("ostalo: " + other);
    }
}
