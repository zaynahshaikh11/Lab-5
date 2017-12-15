Purpose

 

This lab will give you practice working with a binary search tree, and writing a recursive method to access the items in a binary search tree.

 

Lab

 

1) A binary search tree may be displayed horizontally using recursion. Here is the rough algorithm:

 

if (root is not empty)

{

Print right subtree, increasing indentation by one level

Print contents of root

Print left subtree, increasing indentation by one level

}

 

Add a display method to the BinarySearchTree class (pages 616-618), which in turn calls a recursive helper method:

 

-printTree(in root:TreeNode, in indentation:integer)

 

2) Write a program that uses the modified BinarySearchTree class to perform tree sort. Your program should (a) read input from a file, (b) build the binary search tree from the input, (c) display the binary search tree using the method described in part 1, and (d) display the sorted items.

 

input.dat contents:

 

January

February

March

April

May

June

July

August

September

October

November

December

 

 

Sample program dialog:

 

Tree sort program

Enter name of input file: input.dat

 

Binary search tree:

 

September

October

November

May

March

June

July

January

February

December

August

April

 

Sorted items:

 

April

August

December

February

January

July

June

March

May

November

October

September

 

 

To Turn In

 

Submit listings for all files that you write or modify on Insight. Be sure to submit a capture of a sample run, which uses the data shown above, on Insight.

 

Optional: instead of modifying the BinarySearchTree class, use inheritance to derive a DisplayableBST class from the BinarySearchTree class. (The only methods that should be implemented in the DisplayableBST class are the display and printTree methods.)

