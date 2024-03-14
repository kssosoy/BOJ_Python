a,b=map(int,input().split())
matrix=[]
matrix1=[]
for i in range(a):
  row=list(map(int,input().split()))
  matrix.append(row)
for j in range(a):
  row1=list(map(int,input().split()))
  matrix1.append(row1)
for k in range(a):
  for l in range(b):
    matrix[k][l]+=matrix1[k][l]
for i in range(a):
  print(*matrix[i])