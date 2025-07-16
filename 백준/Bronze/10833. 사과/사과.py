n=int(input())
sum=0
for i in range(n):
    student, apple = map(int, input().split())
    sum+=apple%student
print(sum)