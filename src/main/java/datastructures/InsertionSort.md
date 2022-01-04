##[22,27,16,2,18,6] -> Insertion Sort

1. The stages of the above sequence according to the sort type:

   The sorting works like this step by step:

  - 22,27,16,2,18,6
  - 22*,27,16,2,18,6
  - 22,27*,16,2,18,6
  - 16*,22,27,2,18,6
  - 2*,16,22,27,18,6
  - 2,16,18*,22,27,6
  - 2,6*,16,18,22,27

2. The Big-O notation:
   - O(n^2)

3. Time Complexity
  * Best case: O(n) = 6 
  * Average case: O(n^2) = 36
  * Worst case: O(n^2) = 36

4. What case does the number 18 fall into after the array is sorted?
   - When the array is sorted out, it is the best case complexity.

5. The first 4 steps of [7,3,5,8,2,9,4,15,6] according to Insertion Sort.

  * 3*,7,5,8,2,9,4,15,6
  * 3,5*,7,8,2,9,4,15,6
  * 3,5,7*,8,2,9,4,15,6 -- no change in ordered list
  * 3,5,7,8*,2,9,4,15,6 -- no change in ordered list
  * 2*,3,5,7,8,9,4,15,6
  * 2,3,5,7,8,9*,4,15,6

    