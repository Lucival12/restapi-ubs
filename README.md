# Projeto UBS
- O projeto retorna Unidades da UBS no raio de 5km a partir da localização informada.

## Instruções do Projeto
1. Criar um banco de dados no Postrgres com o nome "desafio".
2. No banco de dados execulta a Query abaixo.
```sql
  CREATE TABLE unidade(
     id serial NOT NULL
    ,vlr_latitude                float NOT NULL
    ,                float NOT NULL
    ,cod_munic                   INTEGER  NOT NULL
    ,cod_cnes                    INTEGER  NOT NULL
    ,nom_estab                   VARCHAR(60) NOT NULL
    ,dsc_endereco                VARCHAR(56) NOT NULL
    ,dsc_bairro                  VARCHAR(20)
    ,dsc_cidade                  VARCHAR(32) NOT NULL
    ,dsc_telefone                VARCHAR(26) NOT NULL
    ,dsc_estrut_fisic_ambiencia  VARCHAR(47) NOT NULL
    ,dsc_adap_defic_fisic_idosos VARCHAR(47) NOT NULL
    ,dsc_equipamentos            VARCHAR(47) NOT NULL
    ,dsc_medicamentos            VARCHAR(47) NOT NULL,
    CONSTRAINT unidade_pkey PRIMARY KEY (id)
);
```

3.Modifar o caminho do arquivo para onde esta seu arquivo e no banco de dados execulta a Query abaixo.
```sql
  COPY unidade(vlr_latitude,vlr_longitude,cod_munic,cod_cnes,nom_estab,dsc_endereco,dsc_bairro,dsc_cidade,dsc_telefone,dsc_estrut_fisic_ambiencia,dsc_adap_defic_fisic_idosos,dsc_equipamentos,dsc_medicamentos) 
FROM 'C:\temp\ubs.csv' DELIMITER ',' CSV HEADER;
```

4. Com o eclipse ou netbens abra o projeto e na pasta src/main/resoucers abrir o arquivo e modificar a os campos spring.datasource.url,spring.datasource.username e spring.datasource.password
para a sua configuração do banco do passo 1;
  
5. Rode o projeto e no seu navegador abra na url: http://localhost:8080/swagger-ui.html#/  

    
    
  
