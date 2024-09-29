str1= input()
ans=['c=','c-','dz=','d-','lj','nj','s=','z=']
count=0
i=0
while i< len(str1):
    found=False
    for combo in ans:
        if str1[i:i+len(combo)] == combo:
            count+=1
            i+=len(combo)
            found = True
            break
    if not found:
        count+=1
        i+=1
print(count)