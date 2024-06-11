m, n = map(int, input().split())
num = []
for _ in range(m):
    num.append(list(map(int, input().split())))

k = int(input())

for _ in range(k):
    i, j, x, y = map(int, input().split())
    result = 0  
    for row in range(i-1, x):  
        for col in range(j-1, y):  
            result += num[row][col]
    print(result)