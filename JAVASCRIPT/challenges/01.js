// Escreva uma função isPalindrome(str) que recebe uma string e retorna true se ela for um palíndromo
// (ou seja, se for igual lida de trás para frente), e false caso contrário.

function isPalindrome(str){
    // Primeiro converti a sting para minuscula, para que não interfira na validação.
    const formatStr = str.toUpperCase()

    // Aqui eu usei o metodo split() para transformar a string num array.
    const splitSting = formatStr.split("")
    // Aqui eu usei o metodo reverse() para inverter o array.
    const reverseStr = splitSting.reverse()
    // Aqui eu usei o metodo join() para transformar o array invertido em string novamente.
    const joinStr = reverseStr.join("")   
    
    // Confição para ser um palindromo.
    if(formatStr === joinStr){
        return true;
    }
    return false;
}

isPalindrome("hello")
isPalindrome("Natan")