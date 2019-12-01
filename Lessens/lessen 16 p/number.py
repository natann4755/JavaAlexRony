def number(num):
    n1=(num%10)*100
    num =num/10
    n1 += (num%10)*10
    num =num / 10
    n1 += num % 10
    num =num / 10
    return n1
def nnn():
   while True:
      n=input("coche namber 3 nambers")
      print(number(n))
nnn()