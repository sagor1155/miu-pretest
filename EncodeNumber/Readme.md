The fundamental theorem of arithmetic states that every natural number greater than 1 
can be written as a unique product of prime numbers. 
So, for instance, 6936=2*2*2*3*17*17. Write a method named encodeNumber 
what will encode a number n as an array that contains the prime numbers that, when multiplied together, 
will equal n. So encodeNumber(6936) would return the array {2, 2, 2, 3, 17, 17}. 
If the number is <= 1 the function should return null;

If you are programming in Java or C#, the function signature is int[ ] encodeNumber(int n)
If you are programming in C or C++, the function signature is
int *encodeNumber(int n) and the last element of the returned array is 0.
Note that if you are programming in Java or C#, the returned array should be big enough 
to contain the prime factors and no bigger. If you are programming in C or C++ you will need 
one additional element to contain the terminating zero.

Hint: proceed as follows:
1. Compute the total number of prime factors including duplicates.
2. Allocate an array to hold the prime factors. Do not hard-code the size of the returned array!!
3. Populate the allocated array with the prime factors. The elements of the array when multiplied together should equal the number.

Examples:
n: 1200
Prime factors: {2,2,2,2,3,5,5}
Reason: 1200=2*2*2*2*3*5*5 and those are all prime
