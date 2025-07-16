import math

h, w, n, m = map(int, input().split())
row = math.ceil(h / (n + 1))
col = math.ceil(w / (m + 1))

print(row * col)