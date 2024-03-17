a=int(input())
letter = [[0]*100 for _ in range(100)] 
num=0
for i in range(a):
  b,c=map(int,input().split())
  for j in range(b, b+10):
   for k in range(c,c+10):
     if letter[j][k]==0:
       letter[j][k]=1
     else:
       pass
for i in range(100):
  num+=sum(letter[i])
print(num)