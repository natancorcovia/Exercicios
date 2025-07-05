-- Mostrar a quantidade de agendamentos feitos em cada dia, com a data e o total de agendamentos.
SELECT agendamentos.data , COUNT(*) AS dias
FROM agendamentos
GROUP BY agendamentos.data;