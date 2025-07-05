//Crie uma função chamada dividir que receba dois números, a e b, e retorne o resultado da divisão a / b.

// Se o divisor b for zero, a função deve lançar um erro com a mensagem "Divisão por zero não é permitida!".

// Use try/catch para chamar a função dividir e capturar esse erro, exibindo a mensagem no console.

function dividir(a, b) {
  if (b === 0) {
    throw new Error("Divisão por zero não é permitida!");
  }
  return a / b;
}

try {
  console.log(dividir(4, 2));
  console.log(dividir(2, 0));
} catch (error) {
  console.log(error.message);
}
