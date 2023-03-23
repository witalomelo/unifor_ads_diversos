function contint(N, conjNum) {
    let contador = 0;
  
    for (let i = 0; i < conjNum.length; i++) {
      const n1 = conjuntoNumeros[i];
  
      
      if (Number.isInteger(n1) && n1 >= conjNum[0] && n1 <= N) {
        contador++;
      }
    }
  
    return contador;
  }
  


  