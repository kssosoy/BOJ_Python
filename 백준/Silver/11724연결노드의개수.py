from collections import deque

def bfs(start_node, graph, visited):
    queue = deque([start_node])
    visited.add(start_node)
    while queue:
        curr_node = queue.popleft() 
        for next_node in graph.get(curr_node, []):
            if next_node not in visited:
                visited.add(next_node)
                queue.append(next_node)

    return -1


a, b = map(int, input().split())
my_dict = {}
visited=set()
count=0
for _ in range(b):
    u, v = map(int, input().split())
    if u not in my_dict:
        my_dict[u] = []
    if v not in my_dict:
        my_dict[v]=[] 
    my_dict[u].append(v) 
    my_dict[v].append(u)
for node in range(1,a+1):
    if node not in visited:
        bfs(node, my_dict,visited)
        count+=1
print(count)
