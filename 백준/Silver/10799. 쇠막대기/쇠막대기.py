iron = list(input())
count=0
stack=[]
for i in range (len(iron)):
    if iron[i]=='(':
        stack.append('(')
    else:
        stack.pop()
        if iron[i-1]=="(":
            count+=len(stack)
        else:
            count+=1
print(count)