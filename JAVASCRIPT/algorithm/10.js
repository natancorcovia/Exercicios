// Crie uma função chamada calcularRaizQuadrada que receba um número e retorne sua raiz quadrada.

// Se o número for negativo, a função deve lançar um erro com a mensagem:
// "Número negativo não pode ter raiz quadrada real."

// Use try/catch para chamar a função e capturar o erro, exibindo a mensagem no console.

function calcularRaizQuadrada(num) {
  if (num < 0) {
    throw new Error("Número negativo não pode ter raiz quadrada real.");
  }
  return Math.sqrt(num);
}

try {
  console.log(calcularRaizQuadrada(81));
  console.log(calcularRaizQuadrada(25));
  console.log(calcularRaizQuadrada(-15));
} catch (error) {
  console.log(error.message);
}
