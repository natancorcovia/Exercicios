type Animal = {
  nome: string;
};

type Cachorro = Animal & {
  latir: () => void;
};

type Gato = Animal & {
  miar: () => void;
};

const emitirSom = (animal: Cachorro | Gato) => {
  if ("miar" in animal) {
    return animal.miar();
  }
  return animal.latir();
};
