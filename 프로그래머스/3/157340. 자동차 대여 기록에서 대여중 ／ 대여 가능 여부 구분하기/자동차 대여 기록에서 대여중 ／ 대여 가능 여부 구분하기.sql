-- 코드를 입력하세요
SELECT car_id, MAX(CASE
        WHEN '2022-10-16' BETWEEN START_DATE AND END_DATE THEN '대여중'
        ELSE '대여 가능'
    END) AS AVAILABILITY from car_rental_company_rental_history 
group by car_id  order by car_id desc;