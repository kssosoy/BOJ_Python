stack=[]
exp=input()

for ch in exp:
    if(ch.isalpha()):
        print(ch, end="")
    elif(ch=="("):
        stack.append("(")
    elif(ch==")"):
        while(stack[-1]!="("and len(stack)!=0):
            print(stack.pop(),end="")
        if(len(stack)!=0 and stack[-1]=="("):
            stack.pop()
    elif(ch=="*" or ch=="/"):
        while len(stack) != 0 and (stack[-1] == "*" or stack[-1] == "/" or stack[-1] == "^"):
            print(stack.pop(),end="")
        stack.append(ch)
        
    elif(ch=="+" or ch=="-"):
        while(len(stack)!=0 and stack[-1]!="("):
            print(stack.pop(),end="")
        stack.append(ch)
while len(stack) !=0:
    print(stack.pop(), end="")