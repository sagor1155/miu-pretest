An array is zero-plentiful if it contains at least one 0 and every sequence of 0s is of length at least 4.
Write a method named isZeroPlentiful which returns the number of zero sequences if its array argument is
zero-plentiful, otherwise it returns 0.

array       return

{0, 0, 0, 0, 0}     1

{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}       2

{0,0,0,0,0,1,0,0,0,0,8,0,0,0,0,0,0}     3

{1, 2, 3, 4}        0

{1, 0, 0, 0, 2, 0, 0, 0, 0}     1

{0}                 0