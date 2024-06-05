num=list(range(1,31))
for i in range(0,28):
    a= int(input())
    if(a in num):
        num.remove(a)
for j in num:
    print(j)
