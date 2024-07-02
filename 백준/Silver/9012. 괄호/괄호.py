a=int(input())

for i in range(a):
    input1=input()
    stack=[]
    for j in input1:
        if (j=='('):
            stack.append('(')
        elif(j==')'):
            if(len(stack)>0 and stack[-1]=='('):
                stack.pop()
            else:
                stack.append(')')
    if(len(stack)>=1):
        print("NO")
    else:
        print("YES")

