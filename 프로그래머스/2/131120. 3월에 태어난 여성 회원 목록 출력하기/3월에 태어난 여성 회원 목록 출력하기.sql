--회원의 ID, 이름, 성별, 생년월일
SELECT
    MEMBER_ID,
    MEMBER_NAME,
    GENDER,
    TO_CHAR(DATE_OF_BIRTH, 'YYYY-MM-DD') AS DATE_OF_BIRTH
FROM 
    MEMBER_PROFILE 
-- 조건 : 생일이 3월인 여성 회원
-- 조건 : 전화번호가 NULL인 경우는 출력대상에서 제외
WHERE
    TO_CHAR(DATE_OF_BIRTH, 'MM') = '03'
    AND GENDER = 'W'
    AND TLNO IS NOT NULL
-- 회원ID를 기준으로 오름차순 정렬
ORDER BY
    MEMBER_ID
    
    