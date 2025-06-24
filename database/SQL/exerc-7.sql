-- Mostrar o serviço e o total de agendamentos para cada tipo de serviço.
SELECT servico , COUNT(*) AS total
FROM agendamentos
GROUP BY servico;