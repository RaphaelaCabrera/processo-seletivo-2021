var btn = document.getElementById("btn");


function ehPrimo(numero){
  var resto = 0;
  if(numero > 1 && numero < 100){
    for(var i = 2; i < numero; i++){
      resto = numero % i;
      if(resto == 0){
        return false;
      }
    }
    return true;
  }
  
  else if(numero > 100){
    alert("o número é muito grande");
  }
}

//numero = prompt('Insira o número');
//var resposta = ehPrimo(numero);
//if(resposta == true)
//  alert("o número é primo");
//else
//  alert("o número não é primo");