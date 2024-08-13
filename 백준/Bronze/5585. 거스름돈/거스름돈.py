a=int(input())
count=0
a=1000-a

while True:
  if a//500>0:
    while a>=500:
      a-=500
      count+=1     
  if a//100>0:
    while a>=100:
      a-=100
      count+=1     
  if a//50>0:
    while a>=50:
      a-=50
      count+=1
  if a//10>0:
    while a>=10:
      a-=10
      count+=1
  if a//5>0:
    while a>=5:
      a-=5
      count+=1
  if a//1>0:
    while a>=1:
      a-=1
      count+=1
  if a==0:
    break
  
print(count)