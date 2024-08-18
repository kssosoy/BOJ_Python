n = int(input())
a = list(map(int, input().split()))
m = int(input())
b = list(map(int, input().split()))


count_map = {}
for num in a:
    if num in count_map:
        count_map[num] += 1
    else:
        count_map[num] = 1


answer = []
for num in b:
    if num in count_map:
        answer.append(count_map[num])
    else:
        answer.append(0)

print(*answer)