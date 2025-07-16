n, m = map(int,input().split())
matrixA=[]
matrixB=[]
for i in range(0,n):
    matrixA.append(list(map(int, input().split())))
m,k = map(int,input().split())
for j in range(0,m):
    matrixB.append(list(map(int, input().split())))
answer=[[0]*k for _ in range(n)]
for i in range(0,n):
    for j in range(0,k):
        for l in range(m): 
            answer[i][j] += matrixA[i][l] * matrixB[l][j]
for row in answer :
    print(*row)