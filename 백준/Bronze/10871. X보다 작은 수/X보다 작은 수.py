import sys

count = 0
num1 = []

# Input values from the command line
a, b = map(int, input().split())
num = list(map(int, input().split()))

for i in range(a):
    if num[i] < b:
        print(num[i], end=" ")
