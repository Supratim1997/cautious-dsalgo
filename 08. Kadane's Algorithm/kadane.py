from sys import maxsize

size = int(input("Enter the nunmber of elements: \n"))

listOfElementsA = list(map(int,input("Enter the elements separated by space: \n").strip().split()))

max_so_far = -maxsize - 1
max_ending_here = 0

for i in range(0, size):
    max_ending_here = max_ending_here + listOfElementsA[i]
    if (max_so_far < max_ending_here):
        max_so_far = max_ending_here

    if max_ending_here < 0:
        max_ending_here = 0


print(max_so_far)


    
