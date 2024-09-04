a = int(input())
b = list(input())
count_s = 0
count_l = 0
cup=0

i = 0
while i < a:
    if b[i] == "S":
        count_s += 1
    elif b[i] == "L":
        count_l += 1
        i += 1 
    i += 1  
cup=count_s+count_l+1
if cup>a:
    print(a)
else:
    print(cup)
