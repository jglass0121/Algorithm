-- 코드를 작성해주세요
select count(*) FISH_COUNT, name.FISH_NAME FISH_NAME
from FISH_NAME_INFO name  join FISH_INFO  info
on name.FISH_TYPE = info.FISH_TYPE
group by name.FISH_NAME
order by 1 desc ;
