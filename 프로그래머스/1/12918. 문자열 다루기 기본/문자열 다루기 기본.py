def solution(s):
    
    if (len(s) == 4 or len(s) == 6) and s.isdigit():
        return True
    
    return False

# ref 1
def solution(s):
    return s.isdigit() and len(s) in [4,6]

# ref 2
def alpha_string46(s):
    try:
        int(s)
    except:
        return False
    return len(s) == 4 or len(s) == 6 

# ref 3
def alpha_string46(s):
    import re
    return bool(re.match("^(\d{4}|\d{6})$", s))