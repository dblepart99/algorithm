def isPalindrome(s, start, end):
    diff = int((end - start + 1) / 2 - 1)

    for i in range(diff + 1):
        c1 = s[start + i]
        c2 = s[end - i];

        if c1 != c2:
            return False

    return True


'''
답의 길이는 무조건 len(s)를 벗어날수 없으므로, len(s)를 범주로해서 돌림.
길이가 일정하게 해서 while문을 돌리면서 확인

'''
  
  
def solution(s):
    for answer in range(len(s), 0, -1):
        start = 0
        end = 0 + answer - 1

        while end < len(s):
            if isPalindrome(s, start, end):
                return answer;
            start += 1
            end += 1
            
     

    return 1
