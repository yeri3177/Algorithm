# my
def solution(s):    
    return ''.join(reversed(sorted(s)))

# ref
def solution(s):
    return ''.join(sorted(s, reverse=True))