// Crie um componente que:

// Tenha dois inputs: email e senha

// Exiba embaixo: Email digitado: ... e Senha digitada: ...

// Use useState com um objeto para armazenar os dois campos

import { useState } from "react";

export const Inputs = () => {
  const [usuario, setUsuario] = useState({
    email: "",
    senha: "",
  });

  return (
    <form>
      <div>
        <label htmlFor="email">email: </label>
        <input
          type="text"
          placeholder="insira seu email"
          name="email"
          onChange={(e) =>
            setUsuario((prev) => ({ ...prev, email: e.target.value }))
          }
        />
      </div>
      <div>
        <label htmlFor="senha">senha: </label>
        <input
          type="text"
          placeholder="insira sua senha"
          name="senha"
          onChange={(e) =>
            setUsuario((prev) => ({ ...prev, senha: e.target.value }))
          }
        />
      </div>
      <div>
        <p>Email digitado: {usuario.email}</p>
        <p>Senha digitada: {usuario.senha}</p>
      </div>
    </form>
  );
};
