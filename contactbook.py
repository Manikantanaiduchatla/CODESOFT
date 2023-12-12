names = []
phone_numbers = []
emails=[]
address_s=[]
num=int(input("Enter no.of contacts u want to add: "))



for i in range(num):
    name = input("Name: ")
    phone_number = int(input("Phone Number: "))
    email = input("Enter Email: ") 
    address = input("Enter Address: ")

    names.append(name)
    phone_numbers.append(phone_number)
    emails.append(email)
    address_s.append(address)

print("\nName\t\t\tPhone Number\t\t\tEmail\t\tAddress\n")

for i in range(num):
    print("{}\t\t\t{}\t\t{}\t\t{}".format(names[i], phone_numbers[i],emails[i],address_s[i]))

search_term = input("\nEnter search term: ")

print("Search result:")

if search_term in names:
    index = names.index(search_term)
    phone_number = phone_numbers[index]
    email=emails[index]
    address=address_s[index]
    print("Name: {}, Phone Number: {}, Email: {}, Address: {}".format(search_term, phone_number, email,address))

elif search_term in phone_numbers:
  index=phone_numbers.index(search_term)
  name=names[index]
  email=emails[index]
  address=address_s[index]
  print("Name: {}, Phone Number: {}, Email: {}, Address: {}".format(name, search_term, email,address))
else:  
  print("Name Not Found")
