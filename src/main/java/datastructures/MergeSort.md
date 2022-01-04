## [16,21,11,8,12,22] -> Merge Sort

1. The stages according to the sort type.
   1. 16,21,11,8,12,22
   2. 16,21,11  |  8,12,22
   3. 16  |  21 | 11  |  8  |  12 | 22
   4. 16  |  11,21  |  8  |  12,22
   5. 11,16,21  | 8,12,22
   6. 8,11,12,16,21,22

2. The Big-O notation.

   O(n*log n) = O(6*log6) 