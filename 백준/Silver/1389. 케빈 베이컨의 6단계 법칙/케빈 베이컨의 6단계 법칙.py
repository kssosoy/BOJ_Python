from collections import deque
def bfs(start, graph):
    queue=deque([(start,0)])
    visited=set([(start)])
    num1 = [0] * (a + 1)
    while queue:
        curr_node,distance= queue.popleft()
        num1[curr_node]=distance
        for next_node in graph[curr_node]:
            if next_node not in visited:
                visited.add(next_node)
                queue.append((next_node,distance+1))
                
    return sum(num1)

        


a,b=map(int,input().split())
num={}
answer=[]
for _ in range(b):
    u,v=map(int,input().split())
    if u not in num:
        num[u]=[]
    if v not in num:
        num[v]=[]
    num[u].append(v)
    num[v].append(u)
for i in range(1,a+1):
    answer.append(bfs(i,num))
print(answer.index(min(answer))+1)
