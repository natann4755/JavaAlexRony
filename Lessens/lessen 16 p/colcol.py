def culcul(coise, num1, num2):
  if coise ==1:
      return nam1+nam2
  elif coise ==2:
      return nam1-nam2
  elif coise ==3:
      return nam1*nam2
  else:
      return (nam1 / nam2)

while True:
   chois = input("Selct operation \n1.Add  \n2.Minus  \n3.cepel  \n4.chiluk  \nEnter chooice (1/2/3/4)")
   nam1 = float (input("enter number 1"))
   nam2 = float(input("enter number 2"))
   print(culcul(chois,nam1,nam2))