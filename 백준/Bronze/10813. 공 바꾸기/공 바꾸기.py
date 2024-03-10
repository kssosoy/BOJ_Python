import sys
num=[]
n,m=map(int,sys.stdin.readline().split())
for j in range(n):
  num.append(j+1)
for i in range(m):
  a,b=map(int,sys.stdin.readline().split())
  temp=num[a-1]
  num[a-1]=num[b-1]
  num[b-1]=temp
print(*num)
    