-- 코드를 입력하세요
SELECT COUNT(USER_ID) USERS
FROM USER_INFO 
WHERE AGE BETWEEN 20 AND 29
AND SUBSTRING(JOINED,1,4) = 2021;