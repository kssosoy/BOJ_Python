def back(start, depth):
    if depth==6:
        print(' '.join(map(str, path)))
        return
    
    for i in range(start, len(nums)):
        path.append(nums[i])
        back(i+1, depth+1)
        path.pop()

while True:
    arr = list(map(int, input().split()))
    if(arr[0]==0):
        break
    nums=arr[1:]
    k=arr[0]
    path=[]


    back(0,0)
    print()
