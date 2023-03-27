
#I declare that my work contains no examples of misconduct,such as plagiarism, or collusion

#Any code taken from other sources is referenced within my code solution

#Student ID : 18671441

#Date : 07/12/2021


pass_mark = int(input("Enter the number of pass credits : ")or "0")
defer_mark = int(input("Enter the number of defer credits : ")or "0")
fail_mark = int(input("Enter the number of fail credits : ")or "0")

# the "exclude" outcome can be calculated using a formula therefore enables the code to be more efficient

exclude_cutoff = pass_mark + defer_mark     

if pass_mark == 120:
    print("\nProgress")

elif pass_mark == 100:
    print("\nProgress (module trailer)")

elif 120>= exclude_cutoff > 40:
    print("\nDo not Progress – module retriever")

elif exclude_cutoff <= 40:
    print("\nExclude")

else:
    print("\nError... Try Again")
