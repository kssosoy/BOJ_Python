a=int(input())
s=[]
for _ in range(a):
  word=input()
  if word not in s:
    s.append(word)
s.sort()
s.sort(key=len)

for i in s:
  print(i)