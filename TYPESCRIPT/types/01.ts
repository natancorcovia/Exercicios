type StatusPedido = "pendente" | "em andamento" | "concluido";

const pedido: { id: number | string; status: StatusPedido } = {
  id: 123,
  status: "pendente",
};

const exibirStatus = (pedido: {
  id: number | string;
  status: StatusPedido;
}) => {
  return `Pedido ${pedido.id} está ${pedido.status}.`;
};

console.log(exibirStatus(pedido));
