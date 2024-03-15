# 약수 구하는 함수 1 : O(n)
def divisor(num):
    cnt = 0
    
    for i in range(1, num+1):
        if num % i == 0:
            cnt+=1

    return cnt

# 약수 구하는 함수 2 : O(n**0.5)
def divisor2(num):
    cnt = 0

    for i in range(1, int(num**(1/2)) + 1):
        if (num % i == 0):
            cnt += 1
            if ( (i**2) != num) : 
                cnt += 1
    
    return cnt

# my code 
def solution(left, right):
    answer = 0
    
    for i in range(left, right+1):
        if divisor(i)%2 == 0:
            answer += i
        else:
            answer -= i
    
    return answer

# ref
## ex. 루트 2 = 2**(1/2) = 2**0.5 = math.sqrt(2)
def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        if int(i**0.5) == i**0.5:
            answer -= i
        else:
            answer += i
    return answer

# ref
import math
def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        sqrt = math.sqrt(i)
        if int(sqrt) == sqrt:
            answer -= i
        else:
            answer += i

    return answer
