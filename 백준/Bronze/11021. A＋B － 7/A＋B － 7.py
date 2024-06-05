import sys
a= int(sys.stdin.readline())
for i in range(0,a):
    b,c= map(int, sys.stdin.readline().split())
    print("Case #%d: %d" % (i+1,b+c))