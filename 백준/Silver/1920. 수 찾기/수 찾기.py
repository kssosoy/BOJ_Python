n=int(input())
a=list(map(int,input().split()))
m=int(input())
b=list(map(int,input().split()))
a=sorted(a)
mid=0
for i in range(m):
  low=0
  high=n
  found=False
  while True:
    if low>=high:
      print(0)
      break
    mid=(low+high)//2
    if a[mid]==b[i]:
      print(1)
      break
    elif a[mid]>b[i]:
      high=mid
    elif a[mid]<b[i]:
      low=mid+1