from collections import deque

def bfs(start, graph):
    queue = deque([start])
    visited = set([start])
    answer = {node: [] for node in graph} 
    while queue:
        curr_node = queue.popleft()
        for next_node in graph[curr_node]:
            if next_node not in visited:
                visited.add(next_node)
                queue.append(next_node)
                answer[next_node].append(curr_node) 
    return answer
        
a = int(input())
num = {}
for _ in range(a - 1):
    u, v = map(int, input().split())
    if u not in num:
        num[u] = []
    if v not in num:
        num[v] = [] 
    num[u].append(v)
    num[v].append(u)

result = bfs(1,num)

for key in sorted(result.keys()):
    if key>=2:
        print(' '.join(map(str, result[key])))
