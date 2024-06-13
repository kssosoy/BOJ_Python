a = input()
num = [int(i) for i in a]
check=[0]*10
for i in num:
    if i==9 or i==6:
        if(check[6]>=check[9]):
            check[9]+=1
        else:
            check[6]+=1
    else:
        check[i]+=1
print(max(check))


