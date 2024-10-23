from collections import deque
def bfs(start_x,start_y, graph):
    dx=[-1,1,0,0]
    dy=[0,0,-1,1]
    size=1
    queue=deque([(start_x,start_y)])
    visited.add((start_x,start_y))
    while queue:
        x,y=queue.popleft()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]

            if 0<= nx <len(graph) and 0 <= ny < len(graph[0]):
                if (nx,ny) not in visited and graph[nx][ny]==1:
                    visited.add((nx,ny))
                    queue.append((nx,ny))
                    size+=1
    return size
a,b=map(int,input().split())    
nums1=[]
for _ in range(a):
    nums1.append(list(map(int,input().split())))
visited=set()
total_pictures=0
max_size=0
for i in range(a):
    for j in range(b):
        if (i,j) not in visited and nums1[i][j]==1:
            total_pictures+=1
            pic_size=bfs(i,j,nums1)
            max_size=max(pic_size, max_size)
            
                
        
            
        
print(total_pictures)
print(max_size)
