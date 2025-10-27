SELECT MP.MEMBER_NAME, -- 회원 이름
       RR.REVIEW_TEXT, -- 리뷰 내용
       DATE_FORMAT(RR.REVIEW_DATE, "%Y-%m-%d") AS REVIEW_DATE -- 리뷰 작성일
    from MEMBER_PROFILE MP 
        join REST_REVIEW RR on MP.MEMBER_ID = RR.MEMBER_ID 
    WHERE MP.MEMBER_ID = (SELECT MEMBER_ID -- order을 기준으로 해당 MEMBER_I가 같은 사람을 뺀다.
                             FROM REST_REVIEW
                         GROUP BY MEMBER_ID
                         ORDER BY COUNT(*) DESC LIMIT 1)
    order by RR.REVIEW_DATE ASC, RR.REVIEW_TEXT
