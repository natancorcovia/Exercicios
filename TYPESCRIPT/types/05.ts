type Email = {
  tipo: "email";
  endereco: string;
};

type SMS = {
  tipo: "sms";
  numero: string;
};

type Notificacao = Email | SMS;

const enviarNotificacao = (n: Notificacao) => {
  if (n.tipo === "email") {
    console.log("Enviando e-mail para...");
    return;
  }
  console.log("Enviando SMS para...");
};

const not1: Email = { tipo: "email", endereco: "natan@email.com" };
const not2: SMS = { tipo: "sms", numero: "15999990000" };

enviarNotificacao(not1);

enviarNotificacao(not2);
