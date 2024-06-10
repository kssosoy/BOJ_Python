a= int(input())
count=0
paper=[[0 for _ in range(100)] for _ in range(100)]
for i in range(a):
    x,y=map(int,input().split())
    for j in range(x,x+10):
        for k in range(y,y+10):
            if(paper[j][k]==1):
                continue
            else:
                paper[j][k]=1
for i in range(100):
    for j in range(100):
        if(paper[i][j]==1):
            count+=1
print(count)

