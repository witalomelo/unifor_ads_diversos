function maximoDivisorComum(a, b) {
    if (b === 0) {
      return a;
    }
    return maximoDivisorComum(b, a % b);
  }
  
  console.log(maximoDivisorComum(24, 36));
  console.log(maximoDivisorComum(7, 5));