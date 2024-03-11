def solution(x):
    answer = True
    sum=0
    num=x
    
    while num>0:
        sum += num%10
        num //= 10
    
    if x%sum != 0:
        answer = False
        
    return answer