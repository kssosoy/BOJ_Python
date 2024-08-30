from collections import deque

N, K = map(int, input().split())
graph = []

for _ in range(N):
    a = int(input())
    graph.append(a)

def bfs(graph, K):
    visited = set()
    queue = deque([(0, 0)]) 

    while queue:
        node, depth = queue.popleft()
        if node in visited:
            continue
        visited.add(node)
        next = graph[node]
        if next == K:
            return depth + 1
        queue.append((next, depth + 1))

    return -1  

print(bfs(graph, K))
