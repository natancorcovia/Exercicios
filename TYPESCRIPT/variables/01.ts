let nome: string = "Natan";
let idade: number = 23;
let hobbies: string[] = ["futebol", "poker", "filmes"];
let usuario: [string, number] = ["Natan", 23];

console.log(
  `${usuario[0]} (${
    usuario[1]
  } anos). Meu nome é ${nome} e tenho ${idade} anos. Meus hobbies são: ${hobbies.join(
    ", "
  )}.`
);
