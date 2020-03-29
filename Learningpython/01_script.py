temp = int(input("what's the tempurature"))
##assert temp == 10

user_input = input("enter a float \n")
try:
    float(user_input)
except ValueError as e:
    print(f'{user_input} is not a float')
    print(e)
