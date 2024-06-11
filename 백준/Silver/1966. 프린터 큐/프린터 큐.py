a = int(input())
for _ in range(a):
    m, n = map(int, input().split())
    imp = list(map(int, input().split()))
    
    count = 0
    idx = n
    
    while len(imp) != 0:
        if max(imp) > imp[0]:
            back = imp.pop(0)
            imp.append(back)
            if idx == 0:
                idx = len(imp) - 1
            else:
                idx -= 1
        else:
            count += 1
            imp.pop(0)
            if idx == 0:
                print(count)
                break
            else:
                idx -= 1
