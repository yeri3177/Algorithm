# def solution(phone_number):
#     answer = ''   
#     for i in range(0, len(phone_number)-4):
#         answer += '*' 
#     answer += phone_number[len(phone_number)-4:len(phone_number)]
#     return answer

def solution(phone_number):
    return "*"*(len(phone_number)-4)+phone_number[-4:]
