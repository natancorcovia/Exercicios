interface Usuario {
  nome: string;
  email: string;
  idade?: number;
}

const pessoa = {
  nome: "Natan",
  email: "natan@email.com",
  idade: 23,
};

const info = (pessoa: Usuario) => {
  if (pessoa.idade)
    return `nome: ${pessoa.nome}, email: ${pessoa.email}, idade: ${pessoa.idade} anos.`;
  return `nome: ${pessoa.nome}, email: ${pessoa.email}`;
};
