num=int(input())
arr=list(map(int,input().split()))
dp=[0 for i in range(num)]
for i in range(num):
    dp[i]=arr[i]
    for j in range(i):
        if(arr[j]<arr[i]):
            dp[i]=max(dp[i],dp[j]+arr[i])

print(max(dp))