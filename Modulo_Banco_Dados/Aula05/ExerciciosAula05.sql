--- EXERCICIOS DB_BURGER

--- Consulta Simples
--- 1. Trazer todos os funcionários cadastrados, informando o nome e a data de admissão (data cadastro)
select 
    NM_FUNCIONARIO, 
    DT_CADASTRAMENTO AS DT_ADMISSAO 
from DB_FUNCIONARIO;

--- 2. Selecionar todos os funcionários cadastrados, informarndo o nome e o salário bruto. Mostrar dois campos calculados, projetando um 
--- aumento salarial de 5% e 8%
SELECT
    NM_FUNCIONARIO, 
    VL_SALARIO_BRUTO, 
    VL_SALARIO_BRUTO * 1.05 AS SAL_AJUSTE_5PORC, 
    VL_SALARIO_BRUTO * 1.08 AS SAL_AJUSTE_8PORC 
FROM DB_FUNCIONARIO;

--- 3. Selecionar todos os clientes cadastrados, informando o nome e a quantidade de estrelas.
SELECT 
    NM_CLIENTE,
    QT_ESTRELAS
FROM DB_CLIENTE;

--- 4. Trazer todos os produtos cadastrados, mostrando o descritivo do produto e o valor unitário
SELECT 
    DS_PRODUTO,
    VL_UNITARIO
FROM DB_PRODUTO;

--- Consulta com Condições
--- 1. Trazer todos os clientes que possuem 4 ou mais estrelas
SELECT 
    NM_CLIENTE,
    QT_ESTRELAS
FROM DB_CLIENTE WHERE QT_ESTRELAS >= 4;

--- 2. Selecionar todos os clientes que possuem 3 esterlas ou mais e que tenham o valor médio de compra maior do que R$70
SELECT 
    NM_CLIENTE,
    QT_ESTRELAS,
    VL_MEDIO_COMPRA
FROM DB_CLIENTE WHERE QT_ESTRELAS >= 3 AND VL_MEDIO_COMPRA > 70.00;

--- 3. Trazer todos os clientes com o valor médio de compra acima de R$ 80 informando o nome e a quantidade de estrelas
SELECT 
    NM_CLIENTE,
    QT_ESTRELAS
FROM DB_CLIENTE WHERE VL_MEDIO_COMPRA > 80.00;

--- 4. Listar todos os produtos que possuem um valor unitário maior que R$ 30
SELECT * FROM DB_PRODUTO WHERE VL_UNITARIO > 30.00;

--- Desafios
--- 1. Listar todos os pedidos do primeiro trimestre (Janeiro, Fevereiro e Março) do último ano disponível na base
SELECT * 
    FROM DB_PEDIDO 
WHERE RTRIM(LTRIM(TO_CHAR(DT_PEDIDO, 'MONTH'))) IN ('JANEIRO', 'FEVEREIRO', 'MARÇO')
ORDER BY DT_PEDIDO;

--- 2. Selecionar todos os profissionais cadastrados nos meses de Novembro e Dezembro
SELECT * 
    FROM DB_FUNCIONARIO
WHERE TO_CHAR(DT_CADASTRAMENTO, 'MM') BETWEEN 11 AND 12;

--- 3. Mostrar todos os pedidos realizados no ano de 2018



















