const URL = "https://jsonplaceholder.typicode.com/users"
const list = document.getElementById("lista")

async function carregarUsuarios() {
  const resp = await fetch(URL)
  
  if (resp.status === 200) {
    const usuarios = await resp.json()

    // Limpa a lista antes de adicionar
    list.innerHTML = ""

    // Para cada usuário, cria um <li> com o nome
    usuarios.forEach(user => {
      const li = document.createElement("li")
      li.textContent = user.name
      list.appendChild(li)
    })
  } else {
    alert("Erro ao carregar usuários.")
  }
}
