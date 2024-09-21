from collections import deque

def bfs(start_x, start_y, graph, visited):
    # 상, 하, 좌, 우 이동을 위한 방향 벡터
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    count = 1  # 시작 지점도 단지에 포함되므로 1로 시작
    queue = deque([(start_x, start_y)])
    visited.add((start_x, start_y))  # 시작 좌표를 방문처리
    
    while queue:
        x, y = queue.popleft()
        # 4방향 탐색
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < len(graph) and 0 <= ny < len(graph[0]):
                if (nx, ny) not in visited and graph[nx][ny] == '1':
                    visited.add((nx, ny))
                    queue.append((nx, ny))
                    count += 1  # 단지에 포함되는 집의 수를 증가
    
    return count

# 입력 처리
a = int(input())
graph = [list(input().strip()) for _ in range(a)]

visited = set()  # 방문한 좌표 저장
nums = []  # 단지 크기 저장

# 전체 좌표를 순회하며 단지를 찾음
for i in range(a):
    for j in range(a):
        if graph[i][j] == '1' and (i, j) not in visited:
            # 새로운 단지를 찾으면 BFS를 실행
            nums.append(bfs(i, j, graph, visited))

# 결과 출력
nums.sort()  # 단지 크기를 오름차순 정렬
print(len(nums))  # 총 단지 수
for num in nums:
    print(num)  # 각 단지의 크기 출력
