// Objetivo: Usar useEffect para criar um relógio digital que atualiza automaticamente a hora a cada segundo.

import { useEffect, useState } from "react";

export default function Clock() {
  const [time, setTime] = useState(new Date().toLocaleTimeString());

  useEffect(() => {
    const interval = setInterval(() => {
      setTime(new Date().toLocaleTimeString());
    }, 1000);

    // Cleanup do intervalo ao desmontar o componente
    return () => clearInterval(interval);
  }, []);

  return <p>🕒 Hora atual: {time}</p>;
}
