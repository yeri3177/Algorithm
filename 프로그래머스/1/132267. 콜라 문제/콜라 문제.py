def solution(a, b, n):
    answer = 0
    rem = 0
    
    while n >= a:
        print(n)
        answer += (n//a)*b
        
        n = (n//a)*b + n%a
        
        # print(n)
        # rem += n%a
        
        # n //= a
        # n += rem

    return answer