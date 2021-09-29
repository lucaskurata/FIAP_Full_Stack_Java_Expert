--- Exercícios utilizando Funções de Agregação

--- 1. Trazer a quantidade de funcionários ativos
SELECT 
    COUNT(ST_FUNC) AS QTD_FUNC_ATIV
FROM DB_FUNCIONARIO 
GROUP BY ST_FUNC 
HAVING ST_FUNC = 'A' 

--- 2. Trazer a quantidade de funcionários ativos por nome de departamento
SELECT 
    D.NM_DEPTO,
    D.CD_DEPTO,
    COUNT(F.ST_FUNC) AS QTD_FUNC_ATIV
FROM DB_FUNCIONARIO F
INNER JOIN DB_DEPTO D
ON F.CD_DEPTO = D.CD_DEPTO
GROUP BY D.NM_DEPTO, D.CD_DEPTO, F.ST_FUNC
HAVING F.ST_FUNC = 'A';

--- 3. Trazer a quantidade total de pedidos vendidos e o valor total das vendas por mês
SELECT 
    LTRIM(TO_CHAR(DT_PEDIDO, 'MM')) AS MES_PEDIDO,
    COUNT(NR_PEDIDO) AS QTD_PEDIDO,
    SUM(VL_TOT_PEDIDO)AS VL_TOT_PED
FROM DB_PEDIDO
GROUP BY TO_CHAR(DT_PEDIDO, 'MM')
ORDER BY TO_CHAR(DT_PEDIDO, 'MM');

--- 4. Trazer somente os clientes que fizerem mais do que cinco compras
SELECT
    C.NM_CLIENTE
FROM DB_CLIENTE C
INNER JOIN DB_PEDIDO P
ON C.NR_CLIENTE = P.NR_CLIENTE
HAVING COUNT(P.NR_PEDIDO) >= 5
GROUP BY C.NM_CLIENTE
