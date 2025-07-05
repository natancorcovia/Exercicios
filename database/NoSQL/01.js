// Inserir um novo cliente chamado Lucas Oliveira, telefone 11988888888, com agendamento em 2025-06-21 às 11:00 para o serviço de Barba.
db.clientes.insertOne({
    nome: 'Lucas Oliveira',
    telefone: '11988888888',
    agendamentos: [{
        data: '2025-06-21',
        horario: '11:00',
        servico: 'Barba'
    }
    ]
})