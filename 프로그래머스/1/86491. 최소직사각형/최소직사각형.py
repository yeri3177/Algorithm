def solution(sizes):
    w = 0
    h = 0
    
    for size in sizes:
        w = max(w, max(size[0], size[1]))
        h = max(h, min(size[0], size[1]))
    
    return w*h

# ref1
def solution(sizes):
    return max(max(x) for x in sizes) * max(min(x) for x in sizes)
	
# ref2	
solution = lambda sizes: max(sum(sizes, [])) * max(min(size) for size in sizes)