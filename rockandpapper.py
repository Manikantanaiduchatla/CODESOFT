import random
print("Winning rules of the •Game Rock Paper Scissors• are\n"+
  "Rock Vs Paper -> Paper wins\n"+
    "Rock Vs Scissors -> Rock wins\n"+
      "Scissors Vs Paper -> Scissors wins\n")
def Game():
 
  print("1.Rock\n" "2.Paper\n" "3.Scissors\n")
  choice=int(input("Enter u r choice: "))
  if choice>3 or choice<1:
    print("Please enter a valid choice sir 🙂")
  elif choice==1:
    choice_name="Rock"
  elif choice==2:
    choice_name="Paper"
  else:
    choice_name="Scissors"
  print("Users choice is ",choice_name)
  print("Now it's Computer turn...!")
  comp_choice=random.randint(1,3)
  while comp_choice==choice:
    comp_choice=random.randint(1,3)
  if comp_choice==1:
    comp_choice_name="Rock"
  elif comp_choice==2:
    comp_choice_name="Paper"
  else:
    comp_choice_name="Scissors"
  print("Computer's choice is ",comp_choice_name)
  print(choice_name,"V/S",comp_choice_name)
  if choice==comp_choice:
    print("It's Draw\n")
    result="Draw"
  if choice==1 and comp_choice==2:
    print("Paper Wins\n")
    result="Paper"
  elif choice==2 and comp_choice==1:
    print("Paper Wins\n")
    result="Paper"
  if choice==2 and comp_choice==3:
    print("Scissors Wins\n")
    result="Scissors"
  elif choice==3 and comp_choice==2:
    print("Scissors Wins\n")
    result="Scissors"
  if choice==3 and comp_choice==1:
    print("Rock Wins\n")
    result="Rock"
  elif choice==1 and comp_choice==3:
    print("Rock Wins\n")
    result="Rock"
  if result=="Draw":
    print("Tie")
  if result==choice_name:
    print("User wins🥳")
  else:
    print("Computer wins")
Game()
i=1
while i>=1:
  print("Do u like to play another game")
  
  answer=input()
  if answer=="n":
  
    print("Thank u for playing sir🙂.. Bye👋🏻")
    break
  else:
    print("Ok sir👍🏻")
    Game()
  i+=1
