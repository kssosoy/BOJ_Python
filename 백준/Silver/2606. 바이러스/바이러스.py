from collections import deque

def bfs(graph):
  visited=[]
  queue=deque([1])
  while queue:
    node=queue.popleft()
    if node not in visited:
      visited.append(node)
      queue.extend(graph[node]-set(visited))
  return visited

num_com=int(input())
num=int(input())
graph={}
for i in range(num_com):
  graph[i+1]=set()
for i in range(num):
  a,b=map(int,input().split())
  graph[a].add(b)
  graph[b].add(a)
print(len(bfs(graph))-1)