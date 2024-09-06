a=int(input())
num1=list(map(int,input().split()))
num2=list(map(int,input().split()))
num1.sort()
num2.sort(reverse=True)
ans=0
for i in range(a):
    ans+=num1[i]*num2[i]
print(ans)
