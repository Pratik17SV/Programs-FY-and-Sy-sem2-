# WAP using membership operator to find if there is a vowel present in the word. 
# Accept the word from the user.

word = input("Enter a word:")
vowels="aeiouAEIOU"
for v in vowels:
    if v in word:
        print("The word contain Vowels")
