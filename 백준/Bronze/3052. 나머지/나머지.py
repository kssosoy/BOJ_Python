num=[]
for i in range(0,10):
    a=int(input())
    if (a%42 not in num):
        num.append(a%42)
print(len(num))