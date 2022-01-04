Write the Binary-Search-Tree stages of the sequence [7, 5, 1, 8, 3, 6, 0, 9, 4, 2].

           6
          /  \
         5    7
        /      \
       1        8
      / \        \
     0   3        9
        / \
       2   4

1. Choose 6 as root.
2. Insert numbers which are less than root to the left subtree 
3. Insert numbers which are greater than root to the right subtree
4. 7 > 6 --> insert to right
5. 5 < 6 --> insert to left
6. 1 < 6 && 1 < 5 --> insert to left of no 5
7. 8 > 6 && 8 > 7 --> insert to right of no 7
8. 3 < 6 && 3 < 5 && 3 > 1 --> insert to right of no 1
9. 0 < 6 && 0 < 5 && 0 < 1 --> insert to left of no 1 
10. 9 > 6 && 9 > 7 && 9 > 8 --> insert to right of no 7
11. 4 < 6 && 4 < 5 && 4 > 1 && 4 >  3 --> insert to right of no 3 
12. 2 < 6 && 2 < 5 && 2 > 1 && 2 < 3 --> insert to left of no 3


