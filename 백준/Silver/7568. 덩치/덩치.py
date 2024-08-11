a = int(input())
num = []
count = []


for _ in range(a):
    b, c = map(int, input().split())
    num.append([b, c])


for i in range(a):
    n = 0  
    for j in range(a):
        if num[i][0] < num[j][0] and num[i][1] < num[j][1]:
            n += 1
    count.append(n + 1)  


print(*count)
