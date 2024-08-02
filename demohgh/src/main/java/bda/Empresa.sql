CREATE TABLE IF NOT EXISTS Empresas (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cnpj CHAR(14) NOT NULL,  -- Usar CHAR para representar CNPJ com 14 dígitos
    PRIMARY KEY (id),
    UNIQUE KEY (cnpj)         -- Tornar o CNPJ único
);


CREATE TABLE IF NOT EXISTS empresas_unidades (
    empresa_id INT UNSIGNED NOT NULL,
    cidade_id INT UNSIGNED NOT NULL,
    sede TINYINT(1) NOT NULL,
    PRIMARY KEY (empresa_id, cidade_id),
    FOREIGN KEY (empresa_id) REFERENCES Empresas(id),   -- Referência para Empresas
    FOREIGN KEY (cidade_id) REFERENCES cidades(id)      -- Referência para Cidades
);
