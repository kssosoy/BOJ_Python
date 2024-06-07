def check(inputStr):
    prev=''
    seen=set()
    for j in inputStr:
        if j != prev:
            if j in seen:
                return False
            seen.add(j)
        prev=j
    return True
        
a=int(input())
count=0
for i in range(a):
    inputStr= list(input())
    if(check(inputStr)== True):
        count+=1
print(count)