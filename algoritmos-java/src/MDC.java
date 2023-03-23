import java.util.Scanner;

public class MDC {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
			int n1=0;
			System.out.print("Digite n1:  ");
			n1 = input.nextInt();
			int n2=0;
			System.out.print("Digite n2: ");
			n2 = input.nextInt();
			
			int maior, menor;
			if(n1>n2) {
				maior= n1;
				menor= n2;
			} else {
				maior= n2;
				menor= n1;
			}
			int aux = 0;
			while((maior%menor)!=0) {
				aux= menor;
				menor= (maior%menor);
				aux= maior;
			}
			System.out.print("MDC de ("+ n1 + " , " + n2 + ") = " +
				    menor);
		}
  }
}