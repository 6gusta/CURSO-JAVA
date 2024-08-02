select e.nome as estados , c.nome, regiao from estados e, cidades c
where e.id =  c.estado_id;