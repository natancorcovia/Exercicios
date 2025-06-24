-- INSERIR DADOS DE CLIENTES:
INSERT INTO clientes (id , nome , telefone)
VALUES (1 , 'João Mendes' , '11999999999');

INSERT INTO clientes (id , nome , telefone)
VALUES (2 , 'Lucas Oliveira' , '11999999999');

-- INSERIR DADOS DE AGENDAMENTO:
INSERT INTO agendamentos (id , id_cliente, data , horario , servico)
VALUES (1 , 1 , '2025-06-21' , '10:00' , 'Corte');

INSERT INTO agendamentos (id , id_cliente, data , horario , servico)
VALUES (2 , 2 , '2025-06-21' , '11:00' , 'Barba');