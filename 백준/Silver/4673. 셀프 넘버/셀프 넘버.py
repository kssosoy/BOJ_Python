total=0
num=[]
ans=[]
a=list(range(10000))
for i in range(len(a)):
    total+=a[i]
    num=list(str(a[i]))
    for j in range(len(num)):
        total+=int(num[j])
    if(total in a and total not in ans):
        ans.append(total)
    total=0
result = [x for x in a if x not in ans]
for i in result:
    print(i)