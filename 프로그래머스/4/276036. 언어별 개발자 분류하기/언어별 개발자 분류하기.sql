WITH FRONT AS (
    SELECT SUM(CODE) AS CODE
    FROM SKILLCODES S
    WHERE CATEGORY = 'FRONT END'
)

SELECT 
    CASE 
        WHEN (D.SKILL_CODE & (SELECT CODE FROM FRONT)) AND (D.SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'PYTHON')) THEN 'A'
        WHEN (D.SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'C#')) THEN 'B'
        WHEN D.SKILL_CODE & (SELECT CODE FROM FRONT) THEN 'C'
        END AS GRADE,
        D.ID, D.EMAIL
FROM DEVELOPERS D
HAVING GRADE IS NOT NULL 
ORDER BY GRADE, ID