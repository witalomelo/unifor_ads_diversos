import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        int n1, n2, proxTermo;
        Scanner input = new Scanner(System.in);

        System.out.println("quantidade de numeros: ");
        int num = input.nextInt();

        System.out.println("sequencia de " + num + " termos: ");

        for (int i = 1, i <= num, i++){
            System.out.println(num + " ");

            int proxTerm = n1 + n2;
            n1 = n2;
            n2 = proxTermo;

        }
        input.close();


    }
    
}
