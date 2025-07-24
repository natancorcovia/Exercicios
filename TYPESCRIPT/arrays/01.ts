// Crie uma função chamada filtrarPares que recebe um array de números inteiros
// como parâmetro e retorna um novo array contendo apenas os números pares.

interface FiltrarParesProps {
  numeros: number[];
}

const filtrarPares = ({ numeros }: FiltrarParesProps): number[] => {
  return numeros.filter((numero) => numero % 2 === 0);
};

const resultado = filtrarPares({ numeros: [1, 2, 3, 4, 5, 6] });
console.log(resultado);
