type RespostaServidor = "sucesso" | "erro" | "carregando";

const mostrarMensagem = (status: RespostaServidor) => {
  if (status === "sucesso") return "Operação realizada com sucesso!";
  if (status === "erro") return "Erro ao realizar operação.";
  return "Carregando...";
};

console.log(mostrarMensagem("carregando"));
