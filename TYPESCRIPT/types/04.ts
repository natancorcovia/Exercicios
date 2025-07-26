type Produto = {
  nome: string;
  preco: number;
};

type Estoque = {
  local: string;
  quantidade: number;
};

type ItemEstoque = Produto & Estoque;

const itemEstoque: ItemEstoque = {
  nome: "Microondas",
  preco: 499,
  local: "Alameda Preço baixo, 504",
  quantidade: 10,
};
