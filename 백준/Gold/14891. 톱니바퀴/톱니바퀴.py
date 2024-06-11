t=[] # 힌트보고 참고해서 풀었음 ㅠㅠ
result=0
rotations=[]
for _ in range(4):
    t.append(list(map(int,input().strip())))
k=int(input())
for _ in range(k):
    a,b=map(int,input().split())
    a-=1
    rotations=[0]*4
    rotations[a]=b
    for i in range(a, 0, -1): # 왼쪽
        if t[i][6] != t[i - 1][2]:
            rotations[i - 1] = -rotations[i]
        else:
            break

    for i in range(a, 3): #오른쪽
        if t[i][2] != t[i + 1][6]:
            rotations[i + 1] = -rotations[i]
        else:
            break
    for i in range(4):
        if rotations[i] == 1:  
            num = t[i].pop()  
            t[i].insert(0, num)  
        elif rotations[i] == -1:  
            num = t[i].pop(0)  
            t[i].append(num)  
         
if t[0][0] == 1:
    result += 1
if t[1][0] == 1:
    result += 2
if t[2][0] == 1:
    result += 4
if t[3][0] == 1:
    result += 8

print(result)
            
            
    