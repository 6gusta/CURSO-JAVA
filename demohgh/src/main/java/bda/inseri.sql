


-- Inserção com todos os campos, incluindo o ID
INSERT INTO estados (id, nome, sigla, regiao, populacao)
VALUES (100, 'novo', 'NV', 'Sul', 2.54);

-- Seleciona todos os registros da tabela estados
SELECT * FROM estados;

-- Inserção sem especificar o ID (assumindo que ele é auto-incremento)
INSERT INTO estados (nome, sigla, regiao, populacao)
VALUES ('mais novo', 'MN', 'Norte', 2.51);
