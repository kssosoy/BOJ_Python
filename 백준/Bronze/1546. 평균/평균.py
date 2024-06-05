a= int(input())
num=list(map(float,input().split()))
total=0
for i in range(0,a):
    total+=num[i]/max(num)*100
print(total/a)