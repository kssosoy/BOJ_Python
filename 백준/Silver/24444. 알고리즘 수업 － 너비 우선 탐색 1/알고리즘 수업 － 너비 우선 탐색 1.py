from collections import deque
def bfs(start, graph,visited):
    queue=deque([start])
    order=1
    visited[start]=order
    while queue:
        curr_node = queue.popleft()
        for next_node in graph[curr_node]:
            if visited[next_node]==0:
                order+=1
                queue.append(next_node)
                visited[next_node]=order
                
    return visited[1:]       
    
n,m,r =map(int,input().split())
num={}
visited=[0]*(n+1)
for _ in range(m):
    u,v= map(int,input().split())
    if u not in num:
        num[u]=[]
    if v not in num:
        num[v]=[]
    num[u].append(v)
    num[v].append(u)
    

for key in num:
    num[key].sort()

result=bfs(r,num,visited)

for i in result:
    print(i)