import sys
num=[]
max=0
for i in range(9):
  a=int(sys.stdin.readline())
  num.append(a)
  if a>=max:
    max=a
print(max)
print(num.index(max)+1)