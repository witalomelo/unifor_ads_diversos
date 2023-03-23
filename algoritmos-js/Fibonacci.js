var num = parseInt(prompt("quantos numeros quero mostrar ?"));

var array = [0,1];

for (let i = 2; i < num; i++) {
  array[i] = array[i - 1] + array[i - 2];
}
document.write( array.join(","));