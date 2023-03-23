public class Ordenacao {
    public static void main(String[] args) {
        int vetor[] = {1,33,22,56,9,2,17};
        int aux =0;
        for(int n1 = 0; n1< vetor.length; n1++ ) {
            for(int n2= 0; n2<vetor.length; n2++) {
              if(vetor[n1] <vetor[n2]) {
                aux = vetor[n1];
                vetor[n1] = vetor[n2];
                vetor[n2] = aux;
              }
            }
        }
        for(int i=0;i<vetor.length;i++) {
          System.out.println(vetor[i]);
        }
        }
    }