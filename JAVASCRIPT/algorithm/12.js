//Inverta uma string sem usar .reverse()
let invertida = "";

function inverterString(str) {
  for (let i = str.length - 1; i >= 0; i--) {
    invertida += str[i];
  }

  return invertida;
}

console.log(inverterString("Joaquim"));
