const URL = "https://jsonplaceholder.typicode.com/users"

function enviarUsuario(){
    const nome = document.getElementById("nome").value
const email = document.getElementById("email").value
const dados = { nome  : nome,
                email : email }

    fetch( URL , { method: "POST", headers: {
    "Content-Type": "application/json"
  },
  body: JSON.stringify(dados)
})

.then(resposta => resposta.json())
.then(dados => {
    console.log("Dados enviados com sucesso!")
})
.catch(erro => {
    console.log("Erro ao enviar dados.")
})


}