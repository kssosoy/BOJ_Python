num = int(input())
expression = input() 
values = []
stack = []
dic={}

for ch in expression:
    if ch.isalpha() and ch not in dic:
        dic[ch]=None
for ch in dic:
    dic[ch]=int(input())



for ch in expression:
    if ch.isalpha():  
        stack.append(dic[ch])
    elif ch == "*":
        b = stack.pop()
        a = stack.pop()
        stack.append(a * b)
    elif ch == "+":
        b = stack.pop()
        a = stack.pop()
        stack.append(a + b)
    elif ch == "-":
        b = stack.pop()
        a = stack.pop()
        stack.append(a - b)
    elif ch == "/":
        b = stack.pop()
        a = stack.pop()
        stack.append(a / b)

print(f"{stack[0]:.2f}")