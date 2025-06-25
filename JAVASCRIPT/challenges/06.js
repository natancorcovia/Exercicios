// Dado um array de palavras, filtre apenas as 
// que começam com consoantes (ou seja, não começam com vogais: a, e, i, o, u).

const vowels = ["a" , "e" , "i" , "o" , "u"]

function filterWord(arr){
    return arr.filter((word) => !vowels.includes(word[0].toLowerCase()))
}

filterWord(["uva", "carro", "elefante", "bola", "abelha", "dado"])