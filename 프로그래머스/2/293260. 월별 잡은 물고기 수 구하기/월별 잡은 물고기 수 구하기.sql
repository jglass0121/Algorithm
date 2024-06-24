-- 코드를 작성해주세요

select count(*) FISH_COUNT, Month(TIME) MONTH
from FISH_INFO 
group by Month(TIME)
order by MONTH