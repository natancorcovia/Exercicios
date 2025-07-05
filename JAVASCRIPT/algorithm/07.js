// Dado um array de palavras, remova os acentos e agrupe 
// as palavras por letra inicial, ignorando se é maiúscula ou minúscula.

function groupWords(arr) {
  return arr.reduce((acc, word) => {
    //Primeiro criei um objeto para agrupar as palavras:
    const key = word.normalize("NFD").replace(/[\u0300-\u036f]/g, "")[0].toLowerCase()
    // Cria uma chave dentro do objeto com um array vazio e adiciona a palavra ao array criado:
    if (!acc[key]) { acc[key] = [];} acc[key].push(word)
    return acc;
  }, {});
}


groupWords(["maçã", "Melancia", "banana", "abacaxi", "Pêra", "Pêssego", "mamão"])