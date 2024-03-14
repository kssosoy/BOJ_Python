# 입력된 문자열 중 가장 긴 것의 길이를 찾기 위한 변수 초기화
max_len = 0

# 입력 처리 및 가장 긴 문자열 길이 찾기
arr = []
for _ in range(5):
    line = list(input())  # 바로 리스트로 변환
    arr.append(line)
    # 가장 긴 문자열의 길이 업데이트
    if len(line) > max_len:
        max_len = len(line)

# 각 문자열의 길이를 가장 긴 것에 맞추어 빈 문자열로 패딩
for i in range(5):
    arr[i] += [''] * (max_len - len(arr[i]))

# 세로로 읽기
pri_str = ""
for j in range(max_len):  # 가장 긴 문자열의 길이만큼 반복
    for i in range(5):
        pri_str += arr[i][j]  # 세로로 문자 추가

# 결과 출력
print(pri_str)

