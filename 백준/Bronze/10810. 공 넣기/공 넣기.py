a,b=map(int,input().split())
num=[0]*a
for i in range(0,b):
    c,d,e= map(int,input().split())
    for j in range(c,d+1):
        num[j-1]=e
print(' '.join(map(str, num)))
