package package1;

def find_number_in_array():
    # Get the sequence of numbers from the user
    numbers = []
    print("Enter a sequence of numbers (type 'done' to finish):")
    while True:
        num = input("Enter a number: ")
        if num.lower() == 'done':
            break
        numbers.append(int(num))

    # Get the number to search for
    search_num = int(input("Enter the number to search for: "))

    # Count the occurrences of the number in the array
    count = numbers.count(search_num)

    # Display the result
    if count > 0:
        print(f"The number {search_num} appears {count} times in the array.")
    else:
        print(f"The number {search_num} is not present in the array.")

# Call the function to run the program
find_number_in_array()

