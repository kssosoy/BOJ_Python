a,b=map(int,input().split())
num = list(range(1, a + 1))
for i in range(0,b):
    c,d=map(int, input().split())
    c -= 1
    d -= 1
    while c < d:
        num[c], num[d] = num[d], num[c]
        c += 1
        d -= 1
print(' '.join(map(str,num)))