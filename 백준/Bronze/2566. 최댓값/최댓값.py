matrix=[]
max=0
max_row=0
col=0
for i in range(9):
  row=list(map(int,input().split()))
  matrix.append(row)
for j in range(9):
  for k in range(9):
    if matrix[j][k]>max:
      max=matrix[j][k]
      max_row=j
      col=k
print(max)
print(max_row+1, col+1)