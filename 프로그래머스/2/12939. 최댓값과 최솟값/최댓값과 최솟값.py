def solution(s):
    num = list(map(int, s.split(' ')))
    return str(min(num))+' '+str(max(num))

#ref
def solution(s):
    arr = [int(s) for s in s.split()]
    return f'{min(arr)} {max(arr)}'