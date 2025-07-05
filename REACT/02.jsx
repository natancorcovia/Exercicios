// Criar um componente ListaDeCompras com as seguintes funcionalidades:

// Campo de texto para digitar o nome de um item

// Botão "Adicionar item" que:

// Adiciona o item à lista

// Limpa o campo de texto

// Exibir a lista de itens abaixo

// Mostrar uma mensagem se a lista estiver vazia:
// "Nenhum item adicionado ainda."

// (Extra) Permitir remover um item ao clicar nele

import { useState } from "react";

export default function ListaDeCompras() {
  const [item, setItem] = useState("");
  const [lista, setLista] = useState([]);

  function AddToList() {
    if (item.trim() === "") return;
    setLista((oldLista) => [...oldLista, item]);
    setItem("");
  }

  function RemoveFromList(indexToRemove) {
    setLista((currentList) =>
      currentList.filter((item, index) => index !== indexToRemove)
    );
  }

  return (
    <div>
      <h1>Lista de compras</h1>
      <input
        type="text"
        placeholder="digite um item"
        value={item}
        onChange={(e) => setItem(e.target.value)}
      />
      <button onClick={AddToList}>Add</button>

      {lista.length === 0 ? (
        <p>Nenhum item adicionado ainda.</p>
      ) : (
        <ul>
          {lista.map((nome, index) => (
            <li
              key={index}
              onClick={() => RemoveFromList(index)}
              style={{ cursor: "pointer" }}
            >
              {nome}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}
