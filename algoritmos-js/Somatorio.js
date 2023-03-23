var n1;
var array = [];
var soma = 0;
var limite = parseInt(prompt("Informe quantos números quer somar: "));
for(let i=1; i<=limite; i++) {
  n1 = parseInt(prompt(`Informe o ${i}° número inteiro: `))
  array[i] = n1;
  soma += array[i];
}
document.write("Lista de números: "+ array + " <br>");
document.write("O somatorio da lista é: "+ soma);