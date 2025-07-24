// Uma função chamada apresentarPessoa que receba nome e idade, e retorne uma string com a frase:
// "Meu nome é Natan e tenho 23 anos."

const apresentarPessoa = (nome: string, idade: number): string => {
  return `Meu nome é ${nome} e tenho ${idade} anos.`;
};

console.log(apresentarPessoa("Natan", 23));
