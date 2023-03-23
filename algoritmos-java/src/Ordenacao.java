public class Ordenacao {
    public static void main(String[] args) {
      int vetor[] = {1,33,22,56,9,2,17};
      int aux =0;
      
      for(int a = 0; a< vetor.length; a++ ) {
          for(int b= 0; b<vetor.length; b++) {
            if(vetor[a] <vetor[b]) {
              aux = vetor[a];
              vetor[a] = vetor[b];
              vetor[b] = aux;
            }
          }
      }
      for(int i=0;i<vetor.length;i++) {
        System.out.println(vetor[i]);
      }
    }
  }