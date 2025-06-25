// Dado um array de números, filtre apenas os que são positivos e ímpares.

function filterNumbers(num){
    return num.filter((nums) => nums > 0 && nums % 2 !== 0)
    
}

filterNumbers([-7, -2, 0, 1, 3, 4, 6, 9])