-- 코드를 입력하세요
SELECT ingredient_type, sum(total_order) as total_order from icecream_info as i join first_half as f on i.flavor = f.flavor group by ingredient_type order by sum(total_order) asc