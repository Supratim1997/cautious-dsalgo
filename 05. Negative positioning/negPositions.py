size = int(input("Enter the nunmber of elements: \n"))

listOfElements = list(map(int,input("Enter the elements separated by space: \n").strip().split()))

j = 0
for i in range(size):
    if(listOfElements[i] < 0):
        t = listOfElements[i]
        listOfElements[i] = listOfElements[j]
        listOfElements[j] = t
        j+=1

    
print("Final List : {}\n".format(listOfElements))

    
