def solution(command):
    answer = []
    x=0
    y=0
    direction=0 # 0 이면 위, 1이면 오른쪽 , 2이면 아래쪽, 3이면 왼쪽
    for i in command:
        if i=='R':
            if direction!=3:
                direction+=1
            else: 
                direction=0
        if i =='L':
            if direction!=0:
                direction-=1
            else:
                direction=3
        if i=="G":
            if direction==0:
                y+=1
            elif direction==1:
                x+=1
            elif direction==2:
                y-=1
            else:
                x-=1
        if i=="B":
            if direction==0:
                y-=1
            elif direction==1:
                x-=1
            elif direction==2:
                y+=1
            else:
                x+=1
    answer=[x,y]

                
            
    return answer
