a=int(input())
num=[]
for _ in range(a):
    b=int(input())
    if(b==0):
        num.pop()
    else:
        num.append(b)
print(sum(num))