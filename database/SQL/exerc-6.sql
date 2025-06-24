-- Mostrar o nome do cliente e a quantidade de agendamentos feitos, ordenados do que mais agendou para o que menos agendou.
SELECT clientes.nome , COUNT(*) AS total
FROM agendamentos
JOIN clientes ON agendamentos.id_cliente = clientes.id
GROUP BY clientes.nome
ORDER BY total DESC;