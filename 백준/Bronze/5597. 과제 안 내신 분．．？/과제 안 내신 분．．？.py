num=[]
for i in range(1,31):
  num.append(i)
for j in range(0,28):
  num.remove(int(input()))
print(min(num))
print(max(num))
