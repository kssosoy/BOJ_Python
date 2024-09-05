def dfs(graph):
  count = 0
  visited = set()
  for node in graph:  
      if node not in visited:
          stack = [node]
          while stack:
              current_node = stack.pop()
              if current_node not in visited:
                  visited.add(current_node)
                  stack.extend(set(graph[current_node]) - visited)
          count += 1  
  return count

a = int(input())
for _ in range(a):
    b = int(input())
    num = list(map(int, input().split()))
    graph = {}

    for i in range(b):
        graph[i + 1] = [num[i]] 

    print(dfs(graph))
