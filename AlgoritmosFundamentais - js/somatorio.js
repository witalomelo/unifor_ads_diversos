function somatorio(numbers) {
    let result = 0;
    for (let i = 0; i < numbers.length; i++) {
      result += numbers[i];
    }
    return result;
  }
  
  console.log(somatorio([1, 2, 3, 4, 5]));
  console.log(somatorio([-1, 0, 1]));