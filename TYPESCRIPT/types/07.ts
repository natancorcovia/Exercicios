// Crie uma função que receba um objeto com propriedades titulo (string) e concluido (boolean),
// e retorne uma mensagem baseada nesses dados.

type UmObjeto = {
  titulo: string;
  concluido: boolean;
};

const umaFuncao = (n: UmObjeto) => {
  const status = n.concluido ? "Finalizado" : "Pendente";
  console.log(`Tarefa: ${n.titulo} - Status: ${status}`);
};

umaFuncao({ titulo: "Estudar TypeScript", concluido: true });
