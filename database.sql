CREATE TABLE pessoa 
( id LONG NOT NULL, 
nome VARCHAR(100) NOT NULL, 
datanascimento DATE, 
cpf VARCHAR(14), 
funcionario boolean, 
CONSTRAINT pk_pessoa PRIMARY KEY (id)); 


CREATE TABLE projeto ( 
id LONG NOT NULL, 
nome VARCHAR(200) NOT NULL, 
data_inicio DATE , 
data_previsao_fim DATE , 
data_fim DATE , 
descricao VARCHAR(5000) , 
status VARCHAR(45) , 
orcamento FLOAT , 
risco VARCHAR(45) , 
idgerente LONG NOT NULL, 
CONSTRAINT pk_projeto PRIMARY KEY (id), 
CONSTRAINT fk_gerente FOREIGN KEY (idgerente) 
REFERENCES pessoa (id) ) 

CREATE TABLE membro 
( idprojeto LONG NOT NULL, 
idpessoa LONG NOT NULL, 
CONSTRAINT fk_membros_pessoa FOREIGN KEY (idpessoa) 
REFERENCES projeto (id)   ON UPDATE NO ACTION ON DELETE NO ACTION, 
CONSTRAINT fk_pessoa FOREIGN KEY (idpessoa) REFERENCES pessoa (id) ON UPDATE NO ACTION ON DELETE NO ACTION); 


INSERT INTO pessoa VALUES (1, 'José Augusto', 	'1980-07-22', '03969883423', true); 
INSERT INTO pessoa VALUES (2, 'Milena de Andrade', 	'2018-07-27', '03969883423', true); 
INSERT INTO pessoa VALUES (3, 'Theo de Andrade', 	'2020-05-25', '03969883423', true); 
INSERT INTO pessoa VALUES (4, 'Larissa de Andrade', 	'2020-05-25', '03969883423', false); 
INSERT INTO projeto VALUES (1, 'Teste', '2023-06-21', '2023-06-21', '2023-06-21' , 'projeto de teste ', 'Em análise', 100.0 , 'Alto',  1); 
INSERT INTO projeto VALUES (2, 'Projeto 2', '2023-06-21', '2023-06-21', '2023-06-21' , 'projeto denovo', 'análise realizada', 1000.0 , 'Médio',  3); 


