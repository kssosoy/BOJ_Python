numberList = []
targetNum = 0
result = 0  # 전역 변수로 초기화

def solution(numbers, target):
    global numberList, targetNum, result
    numberList = numbers
    targetNum = target
    result = 0  
    dfs(0, 0)
    return result

def dfs(depth, total):
    global result  
    if depth == len(numberList):
        if total == targetNum:
            result += 1  
        return
    
    dfs(depth + 1, total + numberList[depth])  # 숫자를 더하는 경우
    dfs(depth + 1, total - numberList[depth])  # 숫자를 빼는 경우

    