package JavaCore.Vjezba;
/*
 Write a Java program to insert a word in the middle of the another string.
 */
public class InsertWord {
    public static void main(String[] args) {
        String main_string = "This is tutorial";
        String word = "Java";
        System.out.println(main_string.substring(0, 8) + word + main_string.substring(7));

        String str = "This is tutorials point";
        String substr = "";

        // prints the substring after index 8 till index 17
        substr = str.substring(8, 17);
        System.out.println("substring = " + substr);

        // prints the substring after index 0 till index 8
        substr = str.substring(0, 7);
        System.out.println("substring = " + substr);
    }
}
