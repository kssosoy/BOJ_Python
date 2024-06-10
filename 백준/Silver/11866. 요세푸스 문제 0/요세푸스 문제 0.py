a, b = map(int, input().split())
num = list(range(1, a + 1))
result = []

while len(num) != 0:
    index = (b - 1) % len(num)
    result.append(num[index])  
    num.pop(index) 
    num = num[index:] + num[:index]

output = '<' + ', '.join(map(str, result)) + '>'
print(output)
    