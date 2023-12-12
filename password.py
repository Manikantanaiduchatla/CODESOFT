n=int(input("Enter the length of the password: "))
password=input("Enter u r password: ")
if len(password)<=n and len(password)>=1:
  print("U r password is ",password)
else:
  print("Length of the password exceeded")
