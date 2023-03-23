var numero = parseInt(prompt("digite um numero: "));

let verificaPrimo = true;

for (let i = 2; i < numero; i++){
  if(numero % i === 0) {
    verificaPrimo = false;
    break;
  }
}

if (verificaPrimo) {
  console.log(numero + " é primo");
} else {
  console.log(numero + " não é primo");
}