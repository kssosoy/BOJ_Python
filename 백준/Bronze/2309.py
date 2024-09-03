nums = []
for _ in range(9):
    a = int(input())
    nums.append(a)

found = False
for i in range(9):
    if found:
        break
    for j in range(i + 1, 9):
        num = sum(nums) - nums[i] - nums[j]
        if num == 100:
            num1 = nums[i]
            num2 = nums[j]
            nums.remove(num1)
            nums.remove(num2)
            found = True
            break
nums=sorted(nums)
for num in nums:
    print(num)
