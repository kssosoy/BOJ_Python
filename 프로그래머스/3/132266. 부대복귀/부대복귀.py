from collections import deque
def solution(n, roads, sources, destination):
    graph=[[] for _ in range(n+1)]
    answer = []
    
    for a, b in roads:
        graph[a].append(b)
        graph[b].append(a)
        
    dist=bfs(graph,destination, n)
    return [dist[s] for s in sources]
    
    return answer

def bfs(graph,start,n):
    visited=set()
    queue=deque([start])
    dist=[-1]*(n+1)
    visited.add(start)
    count=0
    dist[start]=0
    
    
    while queue:
        node= queue.popleft()
        
        for next in graph[node]:
            if next not in visited:
                visited.add(next)
                queue.append(next)
                dist[next]=dist[node]+1
    return dist
                