T=int(input())
num=list(map(int,input().split()))

num=set(num)
num=sorted(num)
print(*num)
