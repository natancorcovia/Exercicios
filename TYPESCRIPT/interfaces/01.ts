interface Livro {
  titulo: string;
  autor: string;
  paginas: number;
  disponivel: boolean;
}

const livroFavorito: Livro = {
  titulo: "Clean Code",
  autor: "Robert Martin",
  paginas: 464,
  disponivel: true,
};

const resumoLivro = (livro: Livro): string => {
  return `O livro ${livro.titulo} foi escrito por ${livro.autor} e tem ${livro.paginas} páginas.`;
};

console.log(resumoLivro(livroFavorito));
