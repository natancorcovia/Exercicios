// Faça uma função countVowels(str) que recebe uma string e retorna 
// quantas vogais (a, e, i, o, u) ela contém, independentemente de serem maiúsculas ou minúsculas.

function countVowels(str){
    //Primeiro converti a sting para minuscula, para que não interfira na validação:
    const lowerStr = str.toLowerCase()
    // Aqui apliquei normalize para formatar acentos e caracteres especiais:
    const formatStr = lowerStr.normalize("NFD").replace(/[\u0300-\u036f]/g, "")
    // Aqui eu usei o metodo split() para transformar a string num array:
    const formatToArr = formatStr.split("")
    // Usei o filter para gerar um array apenas com vogais:
    const vowels = formatToArr.filter((word) => {return ["a" , "e" , "i" , "o" , "u"].includes(word)})
    // Finalmente retornei a quantidade de vogais desse array:
    return vowels.length
}
 countVowels("BeatrIz")
 countVowels("larissa")
 countVowels("Programação")

 
// Poderia simplificar com:

// function countVowels(str) {
//   return str
//     .toLowerCase()
//     .normalize("NFD")
//     .replace(/[\u0300-\u036f]/g, "")
//     .split("")
//     .filter(char => "aeiou".includes(char))
//     .length;
// }
