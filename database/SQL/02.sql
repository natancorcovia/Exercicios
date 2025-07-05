-- Listar os nomes dos clientes que marcaram serviços que começam com “C”.
SELECT clientes.nome FROM agendamentos
JOIN clientes ON agendamentos.id_cliente = clientes.id
WHERE agendamentos.servico LIKE 'C%';