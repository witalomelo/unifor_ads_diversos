import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n1;
		int n2;
		int soma;
		
		System.out.print("n1: ");
		n1 = input.nextInt();
		
		System.out.print("n2: ");
		n2 = input.nextInt();
		
		soma = n1 + n2;
		
		System.out.print("soma: " + soma);

    input.close();
	} 

    
}
