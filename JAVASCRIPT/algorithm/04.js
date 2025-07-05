// Dado um array de palavras, remova os acentos e filtre apenas as que têm mais de 5 letras.

function filterArr(arr){
    // Primeramente gerei um novo array com as mesmas palavras sem acentuação:
    const formatWords = arr.map((word) => word.normalize("NFD").replace(/[\u0300-\u036f]/g, ""))
    // Aqui filtrei as palavras com mais de 6 letras:
    const filterWords = formatWords.filter((word) => word.length > 5)
    // Então retornei o novo array com exegencias do enunciado:
    return filterWords
}

filterArr(["maçã", "banana", "limão", "abacaxi", "pêssego", "uva"])