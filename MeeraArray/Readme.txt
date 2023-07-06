Meera array
A Meera array is defined to be an array that contains at least one odd number and begins and 
ends with the same number of even numbers.

- {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} is a Meera array because it begins with three
even numbers and ends with three even numbers, and it contains at least one odd number.
- {2, 4, 6, 8, 6} is not a Meera array because it does not contain an odd number.
- {2, 8, 7, 10, -4, 6} is not a Meera array because it begins with two even numbers but ends
with three even numbers.

Write a function named isMeera that returns 1 if its array argument is a Meera array. Otherwise,
it returns 0.

If you are writing in Java or C#, the function signature is
int isMeera (int[ ] a)

If you are writing in C or C++, the function signature is
int isMeera (int a[ ], int len) where len is the number of elements in the array.