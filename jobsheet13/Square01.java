package jobsheet13;
public class Square01 {
    import java.util.Scanner;

public class Square25 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = user.nextInt();

        for (int iOuter = 1; iOuter<=N; iOuter++){
            for (int i = 1; i<=N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }     
    }
}

}
