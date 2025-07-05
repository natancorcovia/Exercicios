// Criar um componente Contador com as seguintes funcionalidades:

// Botão de incrementar

// Botão de resetar para zero

// Mostrar mensagem quando o valor for múltiplo de 5:
// "🎉 Múltiplo de 5!"

// Impedir que o contador ultrapasse 30

import { useState } from "react";

export default function Contador() {
  const [contador, SetContador] = useState(0);

  function Add() {
    if (contador < 30) {
      SetContador(contador + 1);
    }
  }

  function Reset() {
    SetContador(0);
  }

  const multiploDe5 = contador !== 0 && contador % 5 === 0;

  return (
    <div>
      <h1>Value: {contador}</h1>
      <button onClick={Add}>Add</button>
      <button onClick={Reset}>Reset</button>
      {multiploDe5 && <p>🎉 Múltiplo de 5!</p>}
    </div>
  );
}
