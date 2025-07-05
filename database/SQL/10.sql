-- Mostrar o horário do agendamento mais cedo do dia 2025-06-21.
SELECT  agendamentos.horario FROM agendamentos
WHERE data = '2025-06-21'
ORDER BY horario ASC
LIMIT 1;