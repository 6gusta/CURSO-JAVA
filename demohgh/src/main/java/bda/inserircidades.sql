-- Seleciona todos os estados com ID igual a 25
SELECT * FROM estados WHERE id = 25;

-- Insere uma nova cidade na tabela cidades
INSERT INTO cidades (nome, area, estado_id)
VALUES ('campinas', 795, 25);

-- Insere outra cidade, garantindo a consistência dos nomes das colunas
INSERT INTO cidades (nome, area, estado_id)
VALUES ('Niteroi', 133.9, 25);

-- Insere uma cidade com ID do estado obtido por subconsulta
INSERT INTO cidades (nome, area, estado_id)
VALUES ('cararu', 133.9, (SELECT id FROM estados WHERE sigla = 'PE'));
