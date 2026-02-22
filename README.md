# HW-4

# CS Assignments

---

## Assignment 1: Basic Linked List Operations

### Description
This program implements a singly linked list from scratch using a custom `Node` class. It demonstrates core linked list operations including insertion, searching, and deletion using reference manipulation.

### Concepts Demonstrated
- Dynamic memory allocation
- Pointer/reference manipulation
- Inserting at the head of a linked list
- Searching for a node by key
- Deleting a node by reference
- Handling edge cases such as deleting the head or searching for a missing element

### How It Works
- `listInsert` inserts a node at the head in constant time.
- `listSearch` traverses the list linearly to find a matching key.
- `listDelete` updates references to unlink a given node from the list.

### Time Complexity
- Insert: O(1)
- Search: O(n)
- Delete: O(n)

---

## Assignment 2: Palindrome Linked List

### Description
This program determines whether a singly linked list represents a palindrome. A palindrome reads the same forward and backward.

### Concepts Demonstrated
- Two pointer technique (slow and fast pointers)
- In-place linked list reversal
- Comparing two halves of a list
- Efficient traversal without extra memory

### How It Works
1. Use slow and fast pointers to find the middle of the list.
2. Reverse the second half of the list.
3. Compare the first half with the reversed second half.
4. If all elements match, the list is a palindrome.

### Time Complexity
O(n)

### Space Complexity
O(1)

---

## Assignment 3: Trapped Rainwater Problem

### Description
This program computes how much water can be trapped between bars in an elevation map after rainfall.

### Concepts Demonstrated
- Two pointer optimization
- Array traversal
- Maintaining running maximum values
- Space-efficient algorithm design

### How It Works
- Two pointers start at both ends of the array.
- Track the maximum height seen from the left and right.
- Water is trapped when the current height is less than the maximum boundary height.

### Time Complexity
O(n)

### Space Complexity
O(1)
