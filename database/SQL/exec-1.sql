-- Mostrar nome do cliente e horário de todos os agendamentos do dia 2025-06-21, ordenados pelo horário.
SELECT clientes.nome , agendamentos.horario 
FROM agendamentos
JOIN clientes ON agendamentos.id_cliente = clientes.id
WHERE data = '2025-06-21'
ORDER BY agendamentos.horario;