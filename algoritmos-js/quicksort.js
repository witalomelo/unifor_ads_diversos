function quicksort(array) {
    if (array.length < 2) {
      return array;
    }
    const pivot = array[0];
    const less = [];
    const greater = [];
    for (let i = 1; i < array.length; i++) {
      if (array[i] <= pivot) {
        less.push(array[i]);
      } else {
        greater.push(array[i]);
      }
    }
    return [...quicksort(less), pivot, ...quicksort(greater)];
  }
  
  console.log(quicksort([3, 1, 4, 1, 5, 9, 2, 6, 5, 3]));
  console.log(quicksort([5, 2, 1, 3, 6]));