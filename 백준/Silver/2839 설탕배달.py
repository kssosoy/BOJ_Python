n = int(input())
count = 0

while n > 0:
    if n % 5 == 0:
        count += n // 5
        n = 0
        break
    else:
        n -= 3
        count += 1

if n == 0:
    print(count)
else:
    print(-1)
