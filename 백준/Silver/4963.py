from collections import deque

def bfs(start_x, start_y, graph, visited):
    dx = [-1, 1, 0, 0, -1, -1, 1, 1]
    dy = [0, 0, -1, 1, -1, 1, -1, 1]

    queue = deque([(start_x, start_y)])
    visited.add((start_x, start_y))

    while queue:
        x, y = queue.popleft()
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < len(graph) and 0 <= ny < len(graph[0]):
                if (nx, ny) not in visited and graph[nx][ny] == '1':
                    visited.add((nx, ny))
                    queue.append((nx, ny))

w = 1
h = 1
while w != 0 and h != 0:
    w, h = map(int, input().split())
    if w == 0 and h == 0:
        break

    num = []
    visited = set()
    count = 0

    for _ in range(h):
        num.append(input().split())  

    for i in range(h):
        for j in range(w):
            if (i, j) not in visited and num[i][j] == '1':  
                bfs(i, j, num, visited)
                count += 1

    print(count)
