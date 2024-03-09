-- SELECT *
-- FROM FOOD_PRODUCT 
-- ORDER BY PRICE DESC
-- FETCH FIRST 1 ROWS ONLY;

SELECT * 
FROM (SELECT * FROM FOOD_PRODUCT ORDER BY PRICE DESC)
WHERE ROWNUM = 1