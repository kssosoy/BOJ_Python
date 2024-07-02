while True:
    input1=input()
    stack=[]
    if(input1=='.'):
        break
    for j in input1:
        if (j=='('):
            stack.append('(')
        elif(j==')'):
            if(len(stack)>0 and stack[-1]=='('):
                stack.pop()
            else:
                stack.append(')')
        if(j=='['):
            stack.append('[')
        elif(j==']'):
            if(len(stack)>0 and stack[-1]=='['):
                stack.pop()
            else:
                stack.append(']')
    if(len(stack)>=1):
        print("no")
    else:
        print("yes")