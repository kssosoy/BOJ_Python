-- 코드를 입력하세요
SELECT j.flavor from july as j join first_half as f on j.flavor = f.flavor group by j.flavor order by sum(j.total_order)+sum(f.total_order) desc limit 3