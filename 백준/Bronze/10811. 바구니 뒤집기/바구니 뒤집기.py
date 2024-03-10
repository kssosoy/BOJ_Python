import sys
num=[]
temp=0
m,n=map(int, sys.stdin.readline().split())
for i in range(m):
  num.append(i+1)
for j in range(n):
  a,b=map(int,sys.stdin.readline().split())
  temp=num[a-1:b]
  temp.reverse()
  num[a-1:b]=temp
print(*num)