def num(a,b,c):
    if a>b and a>c:
        return a
    elif b>a and b>c:
        return b
    else:
        return c

def cose ():
    a= input("cose namber")
    b= input("cose namber")
    c= input("cose namber")
    print(num(a,b,c))
cose()
