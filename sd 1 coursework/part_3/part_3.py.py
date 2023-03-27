
# I declare that my work contains no examples of misconduct , such as plagiarism , or collusion

# Any code taken from other sources is referenced within my code solution

# Student ID : 18671441

# Date : 07 / 12 / 2021


counter_1 = 0
counter_2 = 0
counter_3 = 0
counter_4 = 0
Total_counter = 0

def Progression_Outcome():

    try:
        print()
        L=[]                                                                        # 'L' is a list that stores user inputs 
        pass_mark = int(input("Enter the number of pass credits : ")or "0")
        defer_mark = int(input("Enter the number of defer credits : ")or "0")
        fail_mark = int(input("Enter the number of fail credits : ")or "0")
        L.append(pass_mark)
        L.append(defer_mark)
        L.append(fail_mark)
        
         

        if (pass_mark in range(0,121,20)) and (defer_mark in range(0,121,20)) and (fail_mark in range(0,121,20)):

            total_marks = pass_mark + defer_mark + fail_mark

            if total_marks != 120:
                print("\nTotal Incorrect")

            else:
                exclude_cutoff = pass_mark + defer_mark
                
                if pass_mark == 120:
                    print("\nProgress")
                    global new_list1
                    new_list1 = list(L)        
                    #print(new_list1)
                    global counter_1
                    counter_1 += 1
                    
                elif pass_mark == 100:
                    print("\nProgress (module trailer)")
                    global new_list2
                    new_list2 = list(L)
                    #print(new_list2)
                    global counter_2 
                    counter_2 += 1

                elif 120>= exclude_cutoff > 40:
                    print("\nDo not Progress – module retriever")
                    global new_list3
                    new_list3 = list(L)
                    #print(new_list3)
                    global counter_3
                    counter_3 += 1
                    
                elif exclude_cutoff <= 40:
                    print("\nExclude")
                    global new_list4
                    new_list4 = list(L)
                    #print(new_list4)
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

#list

    
progress_list = []
trailer_list = []
retriever_list = []
exclude_list = []


def List():
    global progress_list
    global trailer_list
    global retriever_list
    global exclude_list
    
    l=0
    while l in range (0,counter_1):
        progress_list.append(new_list1)
        print('Progress -',*progress_list[0], sep = ', ')
        l+=1
        
    l=0   
    while l in range (0,counter_2):
        trailer_list.append(new_list2)
        print('Progress (module trailer)-',*trailer_list[0], sep = ', ')
        l+=1
        
    l=0    
    while l in range (0,counter_3):
        retriever_list.append(new_list3)
        print('Do not Progress – (module retriever)-',*retriever_list[0], sep = ', ')
        l+=1
        
    l=0    
    while l in range (0,counter_4):
        exclude_list.append(new_list4)
        print('Exclude-',*exclude_list[0], sep = ', ')
        l+=1


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
    print(' '.join(header))

    for x in range(max(counter_1,counter_2,counter_3,counter_4)):
        print("  {0}         {1}         {2}         {3}".format(    #".format" allows for re-arranging the order of display without changing the arguments
            "*" if x < counter_1 else ' ',
            "*" if x < counter_2 else ' ',
            "*" if x < counter_3 else ' ',
            "*" if x < counter_4 else ' '
            ))
    
    
Total_counter = counter_1 + counter_2 + counter_3 + counter_4

print()
print(Total_counter,"outcomes in total.")

print('-'*100)

List()

print('-'*100)


       
