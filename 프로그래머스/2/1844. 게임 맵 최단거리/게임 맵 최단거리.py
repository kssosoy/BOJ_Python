from collections import deque

def bfs(start_x, start_y, maps):
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    queue = deque([(start_x, start_y, 1)])  # 시작점과 거리 1로 초기화
    visited = set([(start_x, start_y)])
    
    while queue:
        x, y, count = queue.popleft()
        
        # 도착지점에 도달하면 현재까지의 거리를 반환
        if x == len(maps) - 1 and y == len(maps[0]) - 1:
            return count
        
        # 상하좌우로 이동
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            # 맵 경계 내에 있고, 벽이 아니며, 아직 방문하지 않은 경우
            if 0 <= nx < len(maps) and 0 <= ny < len(maps[0]) and maps[nx][ny] == 1:
                if (nx, ny) not in visited:
                    visited.add((nx, ny))
                    queue.append((nx, ny, count + 1))
    
    return -1  # 도착지점에 도달하지 못하면 -1 반환

def solution(maps):
    answer = bfs(0, 0, maps)
    return answer
