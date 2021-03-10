package JavaCore.Vjezba;
/*
Write a Java program to print the following string in a specific format (see the output).
Sample Output

Twinkle, twinkle, little star,
	How I wonder what you are!
		Up above the world so high,
		Like a diamond in the sky.
Twinkle, twinkle, little star,
	How I wonder what you are
 */

public class TwinkleTwinkle {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 2) {
            System.out.println("Twinkle twinkle in the star, \n\t How I wonder what you are");
            x++;
            if (x == 2)
            {
                System.out.println("\t\tUp above the world so high,\n" +
                        "\t\tLike a diamond in the sky. ");
            }else break;
        }
    }
}
