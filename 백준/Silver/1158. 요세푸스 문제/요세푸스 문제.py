from collections import deque
a,b =map(int,input().split())
num=[]
temp=list(i for i in range(1,a+1))
q=deque(temp)
while len(q)>0:
  q.rotate(-(b-1))
  num.append(q.popleft())
print("<" + ", ".join(map(str, num)) + ">")