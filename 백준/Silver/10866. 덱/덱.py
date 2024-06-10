n = int(input())
commands = []
result = []

for _ in range(n):
    command = input().split()
    if len(command) == 2:
        command[1] = int(command[1])
        
    commands.append(command)

for command in commands:
    if command[0] == "push_back":
        result.append(command[1])
    elif command[0] == "push_front":
        result.insert(0, command[1])
    elif command[0] == "front":
        if len(result) == 0:
            print(-1)
        else:
            print(result[0])
    elif command[0] == "back":
        if len(result) == 0:
            print(-1)
        else:
            print(result[-1])
    elif command[0] == "pop_front":
        if len(result) == 0:
            print(-1)
        else:
            print(result[0])
            result.pop(0)
    elif command[0] == "pop_back":
        if len(result) == 0:
            print(-1)
        else:
            print(result[-1])
            result.pop()
    elif command[0] == "size":
        print(len(result))
    elif command[0] == "empty":
        if len(result) > 0:
            print(0)
        else:
            print(1)
