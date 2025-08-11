from collections import deque
#bfs
arr=[2,-1,1]
def bfs (start, end):
    MAX=100001
    visited=[False]*MAX
    time = [0] * MAX

    queue= deque([start])
    visited[start] = True
    
    while queue:
        node=queue.popleft()

        if node==end:
            return time[node]

        for i in range(3):
            if i==0:
                next=node*arr[i]
                if 0<=next<MAX and not visited[next]:
                    
                    visited[next]=True
                    time[next]=time[node]
                    queue.appendleft(next)
                                
            else:
                next=node+arr[i]
                if 0<=next<MAX and not visited[next]:
                    
                    visited[next]=True
                    time[next]=time[node]+1
                    queue.append(next)
    return 0
    

    



n,k=map(int, input().split())
print(bfs(n,k))