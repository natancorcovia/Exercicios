-- Mostrar nome do cliente, data e serviço, somente se o serviço for "Corte" ou "Barba".
SELECT clientes.nome , agendamentos.data , agendamentos.servico
FROM agendamentos
JOIN clientes ON agendamentos.id_cliente = clientes.id
WHERE agendamentos.servico = 'Corte' OR agendamentos.servico = 'Barba';

-- OTIMIZAÇÃO: # WHERE agendamentos.servico IN ('Corte', 'Barba');