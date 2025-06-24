-- CONSULTAR CLIENTES CADASTRADOS:
SELECT * FROM clientes;

-- VER TODOS AGENDAMENTOS DO DIA 21/06/2025:
SELECT * FROM agendamentos
WHERE data = '2025-06-21';

-- MOSTRAR NOME DO CLIENTE E SERVIÇO AGENDADO:
SELECT clientes.nome , agendamentos.servico
FROM agendamentos
JOIN clientes ON agendamentos.id_cliente = clientes.id;
