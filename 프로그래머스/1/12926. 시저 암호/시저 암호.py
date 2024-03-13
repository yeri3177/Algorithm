def solution(s, n):
    answer = ''
    # ord():문자 -> 아스키코드, chr():아스키코드->문자
    # A~Z: 65~90, a~z: 97~122
    for char in s:
        if ord(char) >= 65 and ord(char) <= 90:
            answer += chr(ord(char)+n-26) if ord(char)+n > 90 else chr(ord(char)+n)
        elif ord(char) >= 97 and ord(char) <= 122:
            answer += chr(ord(char)+n-26) if ord(char)+n > 122 else chr(ord(char)+n)
        else:
            answer += char
    
    return answer