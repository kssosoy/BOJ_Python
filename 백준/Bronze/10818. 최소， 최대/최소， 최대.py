import sys
a=int(input())
num=list(map(int, sys.stdin.readline().split()))
print(min(num),end=" ")
print(max(num),end=" ")