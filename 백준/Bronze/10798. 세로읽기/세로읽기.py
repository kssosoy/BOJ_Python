letter=[]
str1=""
maxnum=0
for i in range(5):
  a=list(input())
  if len(a)>=maxnum:
    maxnum=len(a)
  letter.append(a)
for m in range(5):
  letter[m]+=['']*(maxnum-len(letter[m]))
for j in range(maxnum):
  for k in range(5):
    str1+=letter[k][j]
print(str1)