// Crie uma função chamada calcularMedia que aceite qualquer
// quantidade de números como argumento e retorne a média aritmética desses números.

// Regras:
// Use o rest operator (...) para capturar os argumentos.
// Se nenhum número for passado, a função deve retornar null.

function calcularMedia(...nums) {
  // Verifica se foi passado algum numero:
  if (nums.length === 0) return null;
  // Soma os elementos do array:
  const num = nums.reduce((acc, currentValue) => acc + currentValue, 0);
  return num / nums.length;
}
calcularMedia();
calcularMedia(2, 4, 6);
