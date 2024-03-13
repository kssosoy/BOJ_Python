num=int(input())
str_num=[]
sum=0

str1=input()
str_num=list(str1)
for i in range(0,num):
    sum=sum+int(str_num[i])
print(sum)