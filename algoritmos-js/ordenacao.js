const values = [2, 27, 14, 52, 31, 96, 73, 47, 22, 6];
document.write("array antes : [ "+values+ " ] <br>");
function QuickSort(Lista) {
if (Lista.length <= 1) {
   return Lista;
}

const pivot = List[List.length - 1];
const listaEsquerda = [];
const listaDireita = [];

for (let i = 0; i < Lista.length - 1; i++) {
   if (Lista[i] < pivot) {
       listaEsquerda.push(Lista[i]);
   }
   else {
       listaDireita.push(Lista[i])
   }
}

return [...QuickSort(listaEsquerda), pivot, ...QuickSort(listaDireita)];
}
document.write("array depois: [")
document.write(QuickSort(values)+" ]");