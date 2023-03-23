import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int numDivisores=0;
		
		System.out.print("Digite o numero: ");
		num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				numDivisores++;
				}
			}
		if(numDivisores == 2) {
			System.out.print("O numero é primo");
			} else {
			System.out.print("O numero não eh primo");
			}
            scan.close();
		}
	}
