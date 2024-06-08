import sys
num = int(input())
i=1
count=1

while num>i:
    num-=i
    i+=1
    count+=1
if(count%2==0):
    l=num
    r=i+1-num
else:
    l=i+1-num
    r=num
print("%d/%d"%(l,r))
    