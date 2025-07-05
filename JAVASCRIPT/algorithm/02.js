//Crie uma função sumPositiveNumbers(arr) que recebe um array
//de números e retorna a soma apenas dos números positivos (maiores que zero).

function sumPositiveNumbers(arr){
    // Primeiro usei o filter() para separar apenas os elementos positivos do array.
    const positives = arr.filter((nums) => nums > 0)
    // Aqui usei o reduce() para somar o array ja filtrado.
    const sumPositives = positives.reduce((acc , currentValue) => acc + currentValue , 0)
    return sumPositives;
}

sumPositiveNumbers([-1,4,2,3,5,6])


// Poderia simplificar com:

// const sumPositiveNumbers = (arr) => arr
//   .filter(nums => nums > 0)
//   .reduce((acc, currentValue) => acc + currentValue, 0);
