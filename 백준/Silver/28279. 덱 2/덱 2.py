from collections import deque
import sys
input= sys.stdin.readline
a = int(input())
d = deque()

for _ in range(a):
    input1 = input().split()
    command = int(input1[0])
    
    if command == 1:
        d.appendleft(input1[1])
    elif command == 2:
        d.append(input1[1])
    elif command == 3:
        if len(d) == 0:
            print(-1)
        else:
            print(d.popleft())
    elif command == 4:
        if len(d) == 0:
            print(-1)
        else:
            print(d.pop())
    elif command == 5:
        print(len(d))
    elif command == 6:
        if len(d) == 0:
            print(1)
        else:
            print(0)
    elif command == 7:
        if len(d) == 0:
            print(-1)
        else:
            print(d[0])
    elif command == 8:
        if len(d) == 0:
            print(-1)
        else:
            print(d[-1])