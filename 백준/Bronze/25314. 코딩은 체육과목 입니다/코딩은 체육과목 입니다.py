a=int(input())
b=""
num=a//4
for i in range (num,0,-1):
    if(i==1):
        b+="long int"
    else:
        b+="long "
print(b)
