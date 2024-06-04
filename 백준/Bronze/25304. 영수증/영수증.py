num=0
total=int(input())
count = int(input())
for i in range(0,count):
    price, count1= map(int, input().split())
    num+=price*count1
if(total==num):
    print("Yes")
else:
    print("No")