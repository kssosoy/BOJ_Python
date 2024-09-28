from collections import deque

def bfs(start_node, end_node, graph):
    queue = deque([start_node])
    visited = set([start_node])
    count = 0

    while queue:
        level_size = len(queue)         
        for _ in range(level_size):
            curr_node = queue.popleft()           
            if curr_node == end_node:
                return count            
            for next_node in graph[curr_node]:
                if next_node not in visited:
                    visited.add(next_node)
                    queue.append(next_node)       
        count += 1
    
    return -1  


n = int(input())
a, b = map(int, input().split())
m = int(input())
num = {}
for _ in range(m):
    u, v = map(int, input().split())
    if u not in num:
        num[u] = []  
    if v not in num:
        num[v] = []  
    num[u].append(v)
    num[v].append(u)
print(bfs(a,b,num))