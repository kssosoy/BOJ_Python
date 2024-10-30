from collections import deque

def bfs(start_x, start_y,graph):
    dx=[-1,1,0,0]
    dy=[0,0,-1,1]
    queue=deque([(start_x,start_y)])
    visited=set([(start_x,start_y)])
    count=0
    while queue:
        x,y=queue.popleft()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if 0<=nx<len(graph) and 0<=ny<len(graph[0]):
                if (nx,ny) not in visited and graph[nx][ny]!='X':
                    queue.append((nx,ny))
                    visited.add((nx,ny))
                    if graph[nx][ny]=='P':
                        count+=1
    return count
def find_index_2d(array, value):
    for row_index, row in enumerate(array):
        try:
            col_index = row.index(value)  
            return (row_index, col_index)  
        except ValueError:
            continue  
    return None  


n,m=map(int,input().split())
num=[]
for _ in range(n):
    num.append(list(input()))
result=0
row, col = find_index_2d(num, 'I')
result= bfs(row,col, num)
if result==0:
    print('TT')
else:
    print(result)