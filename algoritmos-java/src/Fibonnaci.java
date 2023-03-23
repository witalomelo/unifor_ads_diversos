import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, nextTerm = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números da sequência? ");
        int num = scanner.nextInt();
    
        System.out.print("Sequência de Fibonacci de " + num + " termos: ");
    
        for (int i = 1; i <= num; ++i) {
           System.out.print(n1 + " ");
    
           nextTerm = n1 + n2;
           n1 = n2;
           n2 = nextTerm;
      }
      scanner.close();
    }
    }
