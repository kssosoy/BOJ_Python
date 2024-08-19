T = int(input())
for _ in range(T):
    N, M = map(int, input().split())
    A = list(map(int, input().split()))
    B = list(map(int, input().split()))

    A.sort()  
    B.sort()  

    count = 0
    j = 0

    for i in range(N):
        while j < M and B[j] < A[i]:
            j += 1 
        count += j  

    print(count)