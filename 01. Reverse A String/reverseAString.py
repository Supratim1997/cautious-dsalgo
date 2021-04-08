size = int(input("Enter the nunmber of elements: "))

listOfElements = list(map(int,input("Enter the elements separated by space: ").strip().split()))

print(listOfElements[::-1])
