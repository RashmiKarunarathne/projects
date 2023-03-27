

#I declare that my work contains no examples of misconduct,such as plagiarism, or collusion

#Any code taken from other sources is referenced within my code solution

#Student ID : 18671441

#Date : 07/12/2021



def Progression_Outcome():

    total_marks = pass_mark + defer_mark + fail_mark   
    if total_marks != 120:
        print("\nTotal Incorrect")

    else:
        exclude_cutoff = pass_mark + defer_mark     # the "exclude" outcome can be calculated using a formula therefore enables the code to be more efficient

        if pass_mark == 120:
            print("\nProgress")

        elif pass_mark == 100:
            print("\nProgress (module trailer)")

        elif 120>= exclude_cutoff > 40:
            print("\nDo not Progress – module retriever")
            
        elif exclude_cutoff <= 40:                  # The sum of pass_mark and difer_mark is always less than or  equal to 40 to obtain "Exclude" outcome
            print("\nExclude")

        else:
            print("\nError... Try Again")
            


while True:
    try:
        print()
        pass_mark = int(input("Enter the number of pass credits : ")or "0")
        defer_mark = int(input("Enter the number of defer credits : ")or "0")
        fail_mark = int(input("Enter the number of fail credits : ")or "0")

        if (pass_mark in range(0,121,20)) and (defer_mark in range(0,121,20)) and (fail_mark in range(0,121,20)):

            Progression_Outcome()
            
        else:
            print()
            print("Out of Range")

    except ValueError:
        print()
        print("Integer Required")

