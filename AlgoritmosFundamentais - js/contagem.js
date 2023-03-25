function contagem(array, n) {
  let count = 0;
  for (let i = 0; i < array.length; i++) {
    if (array[i] >= 1 && array[i] <= n) {
      count++;
    }
  }
  return count;
}

console.log(contagem([1, 2, 3, 4, 5], 3));
console.log(contagem([-1, 0, 1, 2, 3], 2));