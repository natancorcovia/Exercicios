// Crie uma função chamada parseJSONSeguro que recebe uma string e tenta transformá-la
// em um objeto JavaScript usando JSON.parse().

// Se a string for um JSON válido, retorne o objeto.

// Se for inválido (por exemplo, tiver erro de sintaxe), capture o erro com try/catch e retorne
// a mensagem: "JSON inválido"

function parseJSONSeguro(str) {
  try {
    return JSON.parse(str); // Verifica se é uma string válida e tenta retornar.
  } catch (error) {
    return "JSON inválido"; // Retorna a mensagem de erro caso nao seja uma string válida.
  }
}
// Testando:
console.log(parseJSONSeguro('{"nome":"Ana","idade":25}'));
console.log(parseJSONSeguro("undefined"));
