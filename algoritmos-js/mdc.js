var n1 = parseInt(prompt("primeiro numero:  "));
var n2 = parseInt(prompt("segundo numero: "));

var menorNum, maiorNum;
var aux=0
if(n1>n2){
    maiorNum=n1;
    menorNum=n2;
}else{
    maiorNum=n2;
    menorNum=n1;
}
while((maiorNum%menorNum)!=0){
    aux=menorNum;
    menorNum=(maiorNum%menorNum);
    maiorNum=aux;
}
document.write("MDC de ("+ A + " , "+ B + ") = " + menorNum);