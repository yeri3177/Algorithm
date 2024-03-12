def solution(price, money, count):
    answer = 0

    for i in range(1, count+1):
        money -= i*price
        
    #answer = 0 if money > 0 else -money
    
    return 0 if money > 0 else -money