# import sys
# from collections import deque

# input = sys.stdin.readline
# a = int(input().strip())
# b = list(map(int, input().split()))
# c = [deque([int(x)]) for x in input().split()]
# d = int(input().strip())
# e = deque(map(int, input().split()))

# answer = []

# for j in range(d):
#     c[0].append(e[j])
#     for i in range(a):
#         if b[i] == 0:
#             if i + 1 < a:
#                 c[i + 1].append(c[i].popleft())
#                 print(c)
#             if i == a - 1:
#                 answer.append(c[i].popleft())
#                 print(c)
#         else:
#             print(c)
#             continue


# print(*answer, sep=' ')
# 위 코드는 시간 초과
from collections import deque
import sys
input = sys.stdin.readline

N = int(input())                    # queuestack을 구성하는 N개의 자료구조
A = list(map(int, input().split())) # 길이 N의 수열 A
B = list(map(int, input().split())) # 길이 N의 수열 B
M = int(input())                    # 삽입할 수열의 길이 M
C = list(map(int, input().split())) # 길이 M의 수열 C

queue = deque([])
for i in range(N):
    if A[i] == 0: # 큐인 자료구조만 모으기
        queue.append(B[i])
       

# 배열 C의 원소를 1개 appendleft 할 때마다 pop 연산 수행
for i in range(M):
    queue.appendleft(C[i])
    print(queue.pop(), end= ' ')
