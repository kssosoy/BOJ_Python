n, k = map(int, input().split())
dp = [0] * (k + 1)
arr = []
for i in range(n):
    w, v = map(int, input().split())
    arr.append((w,v))
for w, v in arr:
    for j in range(k, w - 1, -1): 
        dp[j] = max(dp[j], dp[j - w] + v)
print(dp[k])