-- CRIAR TABELA DE CLIENTES:
CREATE TABLE clientes (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    telefone VARCHAR(11)
)

-- CRIAR TABELA DE AGENDAMENTOS:
CREATE TABLE agendamentos (
    id INT PRIMARY KEY,
    id_cliente INT,
    data DATE,
    horario TIME,
    servico VARCHAR(20),
    FOREIGN KEY (id_cliente) REFERENCES clientes (id)
)