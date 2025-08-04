n=int(input())
dp=[0]*(n+1)
score=[]
for _ in range(n):
    score.append(int(input()))
if n >= 1:
    dp[1] = score[0]
if n >= 2:
    dp[2] = score[0] + score[1]
if n >= 3:
    for i in range(3, n+1):
        dp[i] = max(dp[i-2]+score[i-1], dp[i-3]+score[i-2]+score[i-1])

print(dp[n])   