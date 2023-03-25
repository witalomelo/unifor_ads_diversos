function fibonacci(n) {
    let a = 0;
    let b = 1;
    for (let i = 2; i <= n; i++) {
      let c = a + b;
      a = b;
      b = c;
    }
    return b;
  }
  
  console.log(fibonacci(7));
  console.log(fibonacci(12));