bingo = []
answer = []
count = 0

def check_bingo(bingo):
    bingonum = 0
    
   
    for row in range(5):
        all_zero = True
        for col in range(5):
            if bingo[row][col] != 0:
                all_zero = False
                break
        if all_zero:
            bingonum += 1
    
  
    for col in range(5):
        all_zero = True
        for row in range(5):
            if bingo[row][col] != 0:
                all_zero = False
                break
        if all_zero:
            bingonum += 1
    
    all_zero = True
    for i in range(5):
        if bingo[i][i] != 0:
            all_zero = False
            break
    if all_zero:
        bingonum += 1
    
    
    all_zero = True
    for i in range(5):
        if bingo[i][4 - i] != 0:
            all_zero = False
            break
    if all_zero:
        bingonum += 1
    
    return bingonum


for i in range(5):
    bingo.append(list(map(int, input().split())))


for j in range(5):
    answer.append(list(map(int, input().split())))


for i in range(5):
    for j in range(5):
        num = answer[i][j]
        
        for x in range(5):
            for y in range(5):
                if bingo[x][y] == num:
                    bingo[x][y] = 0

      
        if check_bingo(bingo) >= 3:
            print(count + 1)  
            exit()
        count += 1
