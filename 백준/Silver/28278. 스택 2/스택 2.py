import sys
from collections import deque

queue = deque()
N = int(sys.stdin.readline())

for _ in range(N) :
    i = sys.stdin.readline().split()

    if i[0] == '1' :
        queue.append(int(i[1]))
    
    elif i[0] == '2' :
        if not queue :
            print (-1)
        else :
            print(queue[-1])
            queue.pop()
    
    elif i[0] == '3' :
        print(len(queue))
    
    elif i[0] == '4' :
        if len(queue) == 0 :
            print(1)
        else :
            print(0)
    
    elif i[0] == '5' :
        if not queue :
            print (-1)
        else :
            print(queue[-1])