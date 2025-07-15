from collections import Counter 
def solution(topping):
#접근 2
#set에서 시간을 줄여야 하는데,,,
#대신 한쪽은 앞에서부터 set을 누적, 다른 한쪽은 전체 카운트에서 하나씩 줄여가며 종류 수 추적.
    answer=0
    left=set()
    right=Counter(topping)
    for i in range(0, len(topping)):
        left.add(topping[i])
        right[topping[i]] -= 1
        if right[topping[i]] == 0:
            del right[topping[i]]
        
        if(len(left)==len(right)):
            answer=answer+1
    return answer
#for 문을 돌면서 i를 점점 키우면서 배열을 2개로 분리 
#i=1 , [0:1] [1:] 이런 식으로
# 두 배열을 set 했을때 개수를 비교해서 같으면 count ++ 후 for문 끝나고 리턴
    # answer=0
    # for i in range(0, len(topping)):
    #     if(len(set(topping[0:i]))==len(set(topping[i:]))):
    #         answer=answer+1
    # return answer
#-> 시간 초과

