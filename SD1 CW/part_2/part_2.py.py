

#I declare that my work contains no examples of misconduct,such as plagiarism, or collusion

#Any code taken from other sources is referenced within my code solution

#Student ID : 18671441

#Date : 07/12/2021


counter_1 = 0
counter_2 = 0
counter_3 = 0
counter_4 = 0
Total_counter = 0

def Progression_Outcome():

    try:
        print()
        pass_mark = int(input("Enter the number of pass credits : ")or "0")
        defer_mark = int(input("Enter the number of defer credits : ")or "0")
        fail_mark = int(input("Enter the number of fail credits : ")or "0")

        if (pass_mark in range(0,121,20)) and (defer_mark in range(0,121,20)) and (fail_mark in range(0,121,20)):

            total_marks = pass_mark + defer_mark + fail_mark

            if total_marks != 120:
                print("\nTotal Incorrect")

            else:
                exclude_cutoff = pass_mark + defer_mark

                if pass_mark == 120:
                    print("\nProgress")
                    global counter_1
                    counter_1 += 1

                elif pass_mark == 100:
                    print("\nProgress (module trailer)")
                    global counter_2 
                    counter_2 += 1

                elif 120>= exclude_cutoff > 40:
                    print("\nDo not Progress – module retriever")
                    global counter_3
                    counter_3 += 1
                    
                elif exclude_cutoff <= 40:
                    print("\nExclude")
                    global counter_4
                    counter_4 += 1
                    
                else:
                    print("\nError... Try Again")
            
        else:
            print()
            print("Out of Range")

    except ValueError:
        print()
        print("Integer Required")


#main program

print("Staff Version with Histogram")

Progression_Outcome()

print()
print("Would you like to enter another set of data?")
choice = str(input("Enter 'y' for yes or 'q' to quit and view results : "))

while choice == "y":

    Progression_Outcome()

    print()
    print("Would you like to enter another set of data?")
    choice = str(input("Enter 'y' for yes or 'q' to quit and view results : "))

else:
    
    print('-'*100)

    print("Horizontal Histogram")
    print()
    print("Progress",counter_1, " : ", "*" * counter_1)
    print("Trailer",counter_2, "  : ", "*" * counter_2)
    print("Retriever",counter_3, ": ", "*" * counter_3)
    print("Excluded",counter_4, " : ", "*" * counter_4)
    print()

    print()
        
    Total_counter = counter_1 + counter_2 + counter_3 + counter_4

    print()
    print(Total_counter,"outcomes in total.")

    print('-'*100)
    
    print()
    print("Vertical Histogram")
    print()
    header = ['Progress','Trailing','Retriever','Excluded']
    print(' '.join(header))                                         # ".join" is used to join all the items in the list into a string and then print it

    for x in range(max(counter_1,counter_2,counter_3,counter_4)):
        print("  {0}         {1}         {2}         {3}".format(   # ".format" allows for re-arranging the order of display without changing the arguments
            "*" if x < counter_1 else ' ',
            "*" if x < counter_2 else ' ',
            "*" if x < counter_3 else ' ',
            "*" if x < counter_4 else ' '
            ))
    
    
Total_counter = counter_1 + counter_2 + counter_3 + counter_4

print()
print(Total_counter,"outcomes in total.")

