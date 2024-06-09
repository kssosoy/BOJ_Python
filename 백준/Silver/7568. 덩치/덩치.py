a = int(input())
num = []
count = [0] * a 

for _ in range(a):
    b, c = map(int, input().split())
    num.append([b, c])

for i in range(a):
    prev_x = num[i][0]
    prev_y = num[i][1]
    for j in range(a):
        if prev_x < num[j][0] and prev_y < num[j][1]:
            count[i] += 1


for i in range(a):
    print(count[i] + 1, end=' ')