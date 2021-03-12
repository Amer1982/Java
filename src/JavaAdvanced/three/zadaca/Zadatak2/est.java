package JavaAdvanced.three.zadaca.Zadatak2;

public class est {
    public static void main(String[] args) {
        for (int i = 1; i<=6;i++){
            for (int j = i; j<=i;j++){
                System.out.print(j);
            }for (int k = 6; k > i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
