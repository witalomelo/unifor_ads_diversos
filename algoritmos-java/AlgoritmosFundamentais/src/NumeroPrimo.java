import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n1;
		int numDiv=0;
		
		System.out.print("numero: ");
		n1 = input.nextInt();
		
		for(int i=1; i<=n1; i++) {
			if(n1 % i == 0) {
				numDiv++;
				}
			}
		if(numDiv == 2) {
			System.out.print("O numero eh primo");
			} else {
			System.out.print("O numero não eh primo");
			}
            input.close();
		}
	}
        
    }
    
}
