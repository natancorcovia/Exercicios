// Crie um componente React que exiba a largura atual da janela. Sempre que o usuário redimensionar a janela,
// o valor deve ser atualizado automaticamente na tela.

import { useEffect, useState } from "react";

export default function WindowWidth() {
  const [width, setWidth] = useState(window.innerWidth);

  useEffect(() => {
    // Função que atualiza o estado com a nova largura
    const handleResize = () => {
      setWidth(window.innerWidth);
    };

    // Adiciona o ouvinte de evento de redimensionamento
    window.addEventListener("resize", handleResize);

    // Remove o ouvinte quando o componente for desmontado
    return () => {
      window.removeEventListener("resize", handleResize);
    };
  }, []);

  return <p>A largura da janela é: {width}px</p>;
}
