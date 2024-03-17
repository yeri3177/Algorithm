def solution(n):
    answer = ''

    while n > 0:			
        n, re = divmod(n, 3)
        answer += str(re)
    return int(answer, 3)

# ref
def solution(n):
    tmp = ''
    while n:
        tmp += str(n % 3)
        n = n // 3

    answer = int(tmp, 3)
    return answer