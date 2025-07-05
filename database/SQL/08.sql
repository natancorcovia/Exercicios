-- Mostrar o nome do cliente e o total de agendamentos feitos, retornando apenas o cliente que mais agendou.
SELECT clientes.nome , COUNT(*) AS total
FROM agendamentos
JOIN clientes ON agendamentos.id_cliente = clientes.id
GROUP BY clientes.nome
ORDER BY total DESC
LIMIT 1;