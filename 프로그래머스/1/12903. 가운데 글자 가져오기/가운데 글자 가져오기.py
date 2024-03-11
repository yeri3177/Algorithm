# my code
# def solution(s):
#     answer = ''
#     middle = len(s)//2
#     if len(s)%2 != 0:
#         answer = s[middle:middle+1]
#     else:
#         answer = s[middle-1:middle+1]
#     return answer

def solution(s):
    return s[(len(s)-1)//2 : len(s)//2 + 1]