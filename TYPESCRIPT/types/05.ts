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
