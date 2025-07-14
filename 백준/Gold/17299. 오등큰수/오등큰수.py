n=int(input())
arr=list(map(int, input().split()))
dic={}
for s in arr:
    if(s not in dic):
        dic[s]=1
    else:
        dic[s]+=1    



#stack top에서 다음 값의 dic[top-1]과 dic[top]을 비교했을때
# 현재 top의 등장횟수보다 top-1의 등장횟수가 작다면
# top-1의 오등큰수가 될 수 없으므로 pop
# 마지막 남은 수가 오등큰수
# 스택을 오른쪽에서 왼쪽으로 한 이유는 큰 수 중에서 가장 왼쪽에 있는 수 이어야 하기 때문

stack=[]
result=[0]*n
for i in range(n-1, -1,-1):
    while stack and dic[arr[i]]>= dic[arr[stack[-1]]]:
        stack.pop()
    if stack:
        result[i]=arr[stack[-1]]
    else:
        result[i]=-1
    stack.append(i)
print(*result)