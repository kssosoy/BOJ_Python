a=int(input())
num=list(map(int,(input().split())))
def gcd (a,b):
    for i in range(min(a,b),0,-1):
        if(a%i==0 and b%i==0):
           return i
for i in range(1,a):
    b=gcd(num[0],num[i])
    print(str(int(num[0]/b))+"/"+str(int(num[i]/b)))