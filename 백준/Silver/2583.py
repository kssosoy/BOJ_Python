from collections import deque

def bfs(start_x, start_y, graph, visited):
    queue = deque([(start_x, start_y)])
    visited.add((start_x, start_y))
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    count = 1  
    
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < len(graph) and 0 <= ny < len(graph[0]):
                if (nx, ny) not in visited and graph[nx][ny] == 0:
                    visited.add((nx, ny))
                    queue.append((nx, ny))
                    count += 1  
                
    return count
            
m, n, k = map(int, input().split())
num = [[0] * n for _ in range(m)]
visited = set()
nums = []


for _ in range(k):
    left_x, left_y, right_x, right_y = map(int, input().split())
    for i in range(left_y, right_y):
        for j in range(left_x, right_x):
            num[i][j] = 1


for i in range(m):
    for j in range(n):
        if num[i][j] == 0 and (i, j) not in visited:
            nums.append(bfs(i, j, num, visited))


nums.sort()
print(len(nums))
print(*nums)

    
