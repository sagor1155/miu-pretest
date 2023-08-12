A number is called digit-increasing if it is equal to n + nn + nnn + ... for some digit n between 1 and 9. 
For example 24 is digit-increasing because it equals 2 + 22 (here n = 2)

Write a function called isDigitIncreasing that returns 1 if its argument is digit-increasing 
otherwise, it returns 0.

The signature of the method is int isDigitIncreasing(int n)

n       returns
7       1 
36      1 
984     1 
7404    1

Explanation:
7 = 7 (here n is 7)
36 = 3 + 33
984 = 8 + 88 + 888 
7404 = 6+66+666+6666