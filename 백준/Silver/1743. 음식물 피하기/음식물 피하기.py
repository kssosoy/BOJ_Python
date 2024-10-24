from collections import deque
def bfs (start_x, start_y,graph):
    dx=[-1,1,0,0]
    dy=[0,0,-1,1]
    queue=deque([(start_x,start_y)])
    visited.add((start_x,start_y))
    size=1
    while queue:
        x,y=queue.popleft()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if 0<=nx<len(graph) and 0<=ny<len(graph[0]):
                if (nx,ny) not in visited and graph[nx][ny]==1:
                    size+=1
                    visited.add((nx,ny))
                    queue.append((nx,ny))
    return size
            

n,m,k = map(int,input().split())
num=[[0 for _ in range(m)] for _ in range(n)]
for _ in range(k):
    a,b= map(int,input().split())
    num[a-1][b-1]=1
visited=set()
max_size=0
for i in range(n):
    for j in range(m):
        if (i,j) not in visited and num[i][j]==1:
            size=bfs(i,j,num)
            max_size=max(size, max_size)
print(max_size)