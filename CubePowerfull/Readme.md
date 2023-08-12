A number n>0 is called cube-powerful if it is equal to the sum of the cubes of its digits.
Write a function named isCubePowerful that returns 1 if its argument is cube-powerful; otherwise it
returns 0.
The function prototype is int isCubePowerful(int n);

Hint: use modulo 10 arithmetic to get the digits of the number.

153 = 1 pow 3 + 5 pow 3 + 3 pow 3
        
        Examples:
        n   return
        153 1
        370 1
        371 1
        407 1
        87  0
        0   0
        -81 0
