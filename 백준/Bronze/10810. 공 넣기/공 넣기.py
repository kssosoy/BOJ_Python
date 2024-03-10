import sys
n,m=map(int,sys.stdin.readline().split())
num=[0]*n
for i in range(m):
  a,b,c=map(int,sys.stdin.readline().split())
  for i in range(a-1,b):
      num[i]=c
print(*num)