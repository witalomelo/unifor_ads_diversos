import java.util.Scanner;

public class MDC {
    public static void main(String[] args) {
		try(Scanner n = new Scanner(System.in)) {
			int num1=0;
			System.out.print("Digite o primeiro numero: ");
			num1 = n.nextInt();
			int num2=0;
			System.out.print("Digite o segundo numero: ");
			num2 = n.nextInt();
			
			int maior, menor;
			if(num1>num2) {
				maior= num1;
				menor= num2;
			} else {
				maior= num2;
				menor= num1;
			}
			int aux = 0;
			while((maior%menor)!=0) {
				aux= menor;
				menor= (maior%menor);
				aux= maior;
			}
			System.out.print("MDC de ("+ num1 + " , " + num2 + ") = " +
				    menor);
		}
  }
}