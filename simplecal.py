print("Manikanta Calculator")
print("1.Add")
print("2.Sub")
print("3.Mul")
print("4.Div")

operation=int(input("Enter u r option: "))
if operation==1:
  a=int(input("Enter 1st number: "))
  b=int(input("Enter 2nd number: "))
  print("Sum of",a,"and",b,"is",a+b)
elif operation==2:
  a=int(input("Enter 1st number: "))
  b=int(input("Enter 2nd number: "))
  print("Difference of",a,"and",b,"is",a-b)
elif operation==3:
  a=int(input("Enter 1st number: "))
  b=int(input("Enter 2nd number: "))
  print("Multiplication of",a,"and",b,"is",a*b)
elif operation==4:
  a=int(input("Enter 1st number: "))
  b=int(input("Enter 2nd number: "))
  print("Division of",a,"and",b,"is",a/b)
else:
  print("Invalid choice")
