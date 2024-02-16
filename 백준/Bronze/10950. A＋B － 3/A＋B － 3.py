num=int(input())
num3=[]
for i in range (0,num):
    num1,num2= input().split()
    num3.append(int(num1)+int(num2))
for j in range (0,num):
    print(num3[j])
