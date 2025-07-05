-- Agendamentos entre 10h e 11h, ordenados do mais recente para o mais antigo.
SELECT clientes.nome , agendamentos.horario
FROM agendamentos
JOIN clientes ON agendamentos.id_cliente = clientes.id
WHERE horario BETWEEN '10:00' AND '11:00'
ORDER BY horario DESC;