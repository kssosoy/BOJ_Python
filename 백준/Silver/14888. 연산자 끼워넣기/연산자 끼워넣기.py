
max_num = -1e9
min_num = 1e9

def calc():
    res = arr[0]
    for i in range(len(path)):
        if path[i] == '+':
            res += arr[i + 1]
        elif path[i] == '-':
            res -= arr[i + 1]
        elif path[i] == '*':
            res *= arr[i + 1]
        elif path[i] == '/':
            if res < 0:
                res = -(-res // arr[i + 1])  
            else:
                res = res // arr[i + 1]
    return res

def back(depth):
    global max_num, min_num

    if depth == len(arr) - 1:
        result = calc()
        max_num = max(max_num, result)
        min_num = min(min_num, result)
        return

    for i in range(len(op_arr)):
        if not used[i]:  
            used[i] = True
            path.append(op_arr[i])
            back(depth + 1)
            path.pop()
            used[i] = False


num = int(input())
arr = list(map(int, input().split()))
op = list(map(int, input().split()))


op_arr = []
symbols = ['+', '-', '*', '/']
for i in range(4):
    op_arr += [symbols[i]] * op[i]


used = [False] * len(op_arr)
path = []


back(0)
print(int(max_num))
print(int(min_num))