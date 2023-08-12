Consider a simple pattern matching language that matches arrays of integers. A pattern is an array of integers. An array matches a pattern if it contains sequences of the pattern elements in the same order as they appear in the pattern. So for example, the array {1, 1, 1, 2, 2, 1, 1, 3} matches the pattern {1, 2, 1, 3} as follows:
   {1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3} (first 1 of pattern matches three 1s in array)
   {1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3} (next element of pattern matches two 2s in array) {1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3} (next element of pattern matches two 1s in array) {1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3} (last element of pattern matches one 3 in array)
   The pattern must be completely matched, i.e. the last element of the array must be matched by the last element of the pattern.
   
Here is an incomplete function that does this pattern matching. 
It returns 1 if the pattern matches the array, otherwise it returns 0.

   static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
       // len is the number of elements in the array a, patternLen is the number of elements in the pattern.
       int i=0; // index into a
       int k=0; // index into pattern
       int matches = 0; // how many times current pattern character has been matched so far for (i=0; i<len; i++) {

      for (i=0; i<len; i++) {
        if (a[i] == pattern[k])
       matches++; // current pattern character was matched
       else if (matches == 0 || k == patternLen-1)
       return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)
       else // advance to next pattern character {
       !!You write this code!!
       } // end of else } // end of for
       // return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)
        }  
     if (i==len && k==patternLen-1) return 1; else return 0; }

   Please finish this function by writing the code for the last else statement. Your answer just has to include this code, you do not have to write the entire function.