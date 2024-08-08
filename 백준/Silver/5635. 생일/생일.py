a= int(input())
s=[]
for _ in range(a):
  name, day,month,year= input().split()
  s.append([name,int(day),int(month),int(year)])
s.sort(key=lambda x:(x[3],x[2],x[1] ))
print(s[-1][0])
print(s[0][0])