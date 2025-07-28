
def back(start, sum_now):
    global count
    if(sum_now==s and path):
        count+=1
    for i in range(start, len(arr)):
        path.append(arr[i])
        back(i+1,sum_now+arr[i])
        path.pop()
           


n,s=map(int,input().split())
arr=list(map(int, input().split()))
path=[]
count=0
back(0,0)
print(count)