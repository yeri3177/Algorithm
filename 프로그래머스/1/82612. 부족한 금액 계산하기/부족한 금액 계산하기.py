# my
def solution(price, money, count):
    for i in range(1, count+1):
        money -= i*price
    
    return 0 if money > 0 else -money

# ref
def solution(price, money, count):
    return max(0,price*(count+1)*count//2-money) 

# p + 2p + 3p+ .... + count*p
# sum = (p + count*p) * count /2
# sum = p(1+count)*count /2
