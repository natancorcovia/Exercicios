type Endereco = {
  rua: string;
  cidade: string;
};

type Contato = {
  telefone: string;
  email: string;
};

type Cliente = Endereco & Contato;

const cliente1: Cliente = {
  rua: "Avenida principal",
  cidade: "Sorocaba",
  telefone: "(15) 99999-9999",
  email: "natan@email.com",
};
