from collections import deque
def bfs(start_x, start_y,end_x,end_y, graph):
    dx=[-1,1,0,0]
    dy=[0,0,-1,1]

    queue=deque([(start_x, start_y,[(start_x,start_y)])])
    visited=set([(start_x, start_y)])

    while queue:
        x,y,path=queue.popleft()
        if x==end_x and y==end_y:
            return len(path)
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]

            if 0<= nx <len(graph) and 0 <= ny<len(graph[0]):
                if(nx,ny) not in visited:
                    if graph[nx][ny] =='1':
                        visited.add((nx,ny))
                        queue.append((nx,ny,path+[(nx,ny)]))
    return -1
    


a,b= map(int,input().split())
num=[]
for i in range(a):
    num.append(list(input().strip()))
print(bfs(0,0,a-1,b-1,num))