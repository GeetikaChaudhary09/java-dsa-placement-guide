# Java DSA & LeetCode Placement Guide 2.0

> A pattern-wise Java DSA roadmap for coding rounds, online assessments, and technical interviews.  
> Learn the pattern, solve the problem yourself, explain the approach, and track your progress.

**Language:** Java  
**Practice platform:** [LeetCode](https://leetcode.com/problemset/)  
**Repository goal:** Keep accepted Java solutions, pattern notes, complexity analysis, and revision logs in one place.

---

## Table of contents

- [How to use this repository](#how-to-use-this-repository)
- [Pattern recognition cheat sheet](#pattern-recognition-cheat-sheet)
- [0. Programming foundations and complexity](#0-programming-foundations--time-space-complexity)
- [1. Java problem-solving basics](#1-java-problem-solving-basics)
- [2. Arrays and hashing](#2-arrays--hashing)
- [3. Two pointers](#3-two-pointers)
- [4. Sliding window](#4-sliding-window)
- [5. Prefix sum](#5-prefix-sum--difference-array)
- [6. Binary search](#6-binary-search)
- [7. Strings](#7-strings)
- [8. Linked lists](#8-linked-lists)
- [9. Stack and monotonic stack](#9-stack--monotonic-stack)
- [10. Queue and deque](#10-queue--deque)
- [11. Heap / priority queue](#11-heap--priority-queue--top-k)
- [12. Intervals](#12-intervals)
- [13. Recursion and backtracking](#13-recursion-and-backtracking)
- [14. Trees and binary trees](#14-trees--binary-trees)
- [15. Graphs](#15-graphs)
- [16. Greedy](#16-greedy)
- [17. Dynamic programming](#17-dynamic-programming)
- [18. Trie and union-find](#18-trie--union-find-dsu)
- [19. Bit manipulation and math](#19-bit-manipulation--math)
- [Daily workflow with LeetHub](#daily-workflow-with-leethub)
- [Folder structure](#folder-structure)
- [Commit message convention](#commit-message-convention)
- [Solution quality checklist](#solution-quality-checklist)
- [Useful resources](#useful-resources)

---

## How to use this repository

For every problem:

1. Read the problem and constraints carefully.
2. Identify the likely pattern before coding.
3. Think of a brute-force approach first.
4. Improve it and write the Java solution.
5. Submit on LeetCode and make sure it is **Accepted**.
6. Add a short explanation, time complexity, and space complexity in your notes.
7. Revisit the problem after 1 day, 7 days, and 21 days.

**Do not measure progress only by the number of green submissions.** Measure whether you can recognise the pattern and reproduce the solution without looking.

---

## Pattern recognition cheat sheet

| Problem clue | Think about |
|---|---|
| Pair, duplicate, frequency, complement | HashMap / HashSet |
| Sorted array, pair from both ends | Two pointers |
| Contiguous subarray / substring | Sliding window or prefix sum |
| Range sum / count subarrays with target sum | Prefix sum + HashMap |
| Sorted search space or minimum feasible answer | Binary search |
| Level-by-level tree traversal / minimum edges | BFS |
| Tree paths, subtree, recursive structure | DFS |
| Next greater / smaller element | Monotonic stack |
| K largest / K smallest / frequent elements | Heap / PriorityQueue |
| Generate all subsets / permutations / combinations | Backtracking |
| Dependencies and prerequisites | Topological sort |
| Connected components / connectivity after unions | Union-Find |
| Best answer from smaller overlapping states | Dynamic programming |
| Choose locally optimal compatible intervals | Greedy / sorting |

A clue is a starting point, not a guarantee. Check constraints and prove why the pattern works.

---

## 0. Programming Foundations & Time-Space Complexity

Before starting problem patterns, build a strong base in problem-solving and algorithm analysis.

### Essential concepts

- Input/output, constraints, edge cases, and integer overflow.
- Variables, loops, conditionals, methods, arrays, strings, and basic Java collections.
- Dry runs, tracing variables, and converting examples into logic.
- Brute force first, then optimisation.
- Time complexity: Big-O, Big-Theta, Big-Omega (know the meaning of each).
- Space complexity: auxiliary space vs total space.
- Best, average, and worst-case analysis.
- Recursion stack space.

### Complexity reference

| Complexity | Common name | Typical example |
|---|---|---|
| O(1) | Constant | Array index access |
| O(log n) | Logarithmic | Binary search |
| O(n) | Linear | One array traversal |
| O(n log n) | Linearithmic | Merge sort |
| O(n²) | Quadratic | Two nested loops |
| O(n³) | Cubic | Three nested loops |
| O(2ⁿ) | Exponential | Generating all subsets |
| O(n!) | Factorial | Generating all permutations |

### Foundational practice questions

| # | Problem | Level | Concept |
|---:|---|---|---|
| 1480 | [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/) | Easy | Array traversal |
| 1672 | [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/) | Easy | Nested loops |
| 1920 | [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/) | Easy | Indexing |
| 1929 | [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/) | Easy | Array basics |
| 1295 | [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/) | Easy | Digit counting |
| 1342 | [Number of Steps to Reduce a Number to Zero](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/) | Easy | Loops / bit logic |
| 1913 | [Maximum Product Difference Between Two Pairs](https://leetcode.com/problems/maximum-product-difference-between-two-pairs/) | Easy | Sorting / tracking |
| 1486 | [XOR Operation in an Array](https://leetcode.com/problems/xor-operation-in-an-array/) | Easy | Basic bitwise operations |

**Complexity practice:** For every solution in this repository, state the time and auxiliary-space complexity and justify it briefly.

## 1. Java Problem-Solving Basics

Review these Java tools before moving into data-structure patterns:

- Primitive types, casting, operators, loops, methods, and arrays.
- `String`, `StringBuilder`, `charAt()`, and string comparison.
- `ArrayList`, `Arrays.sort()`, and `Collections.sort()`.
- `HashMap`, `HashSet`, and `getOrDefault()`.
- `ArrayDeque` for stack and queue operations.
- `PriorityQueue` with custom comparators.
- `Comparator`, sorting objects, and lambda basics.
- `int` vs `long`, overflow checks, and safe comparisons.
- Recursion, base cases, and call-stack tracing.

### Java fundamentals practice

| # | Problem | Level | Concept |
|---:|---|---|---|
| 9 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | Easy | Number manipulation |
| 13 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | Easy | HashMap / string scan |
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | Stack / collections |
| 26 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Easy | In-place array |
| 27 | [Remove Element](https://leetcode.com/problems/remove-element/) | Easy | In-place array |
| 88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | Easy | Array pointers |
| 136 | [Single Number](https://leetcode.com/problems/single-number/) | Easy | XOR |
| 412 | [Fizz Buzz](https://leetcode.com/problems/fizz-buzz/) | Easy | Conditions / loops |

## 2. Arrays & Hashing

**Core patterns:** HashMap frequency, HashSet lookup, sorting, in-place updates, prefix/suffix arrays.

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | HashMap complement |
| 217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Easy | HashSet |
| 242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | Easy | Frequency count |
| 49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Medium | HashMap grouping |
| 238 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Medium | Prefix / suffix |
| 128 | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) | Medium | HashSet |
| 169 | [Majority Element](https://leetcode.com/problems/majority-element/) | Easy | Boyer–Moore |
| 347 | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | Medium | Frequency + heap / bucket |
| 560 | [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | Medium | Prefix sum + HashMap |
| 53 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Medium | Kadane |
| 189 | [Rotate Array](https://leetcode.com/problems/rotate-array/) | Medium | In-place reversal |
| 75 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | Medium | Dutch National Flag |

## 3. Two Pointers

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Easy | Opposite pointers |
| 167 | [Two Sum II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | Medium | Sorted two pointers |
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Medium | Greedy pointer movement |
| 15 | [3Sum](https://leetcode.com/problems/3sum/) | Medium | Sort + two pointers |
| 16 | [3Sum Closest](https://leetcode.com/problems/3sum-closest/) | Medium | Sort + two pointers |
| 42 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | Hard | Two pointers |
| 26 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Easy | Slow / fast pointers |

## 4. Sliding Window

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 121 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | Easy | Running minimum |
| 643 | [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/) | Easy | Fixed window |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | Variable window + set/map |
| 424 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) | Medium | Variable window |
| 567 | [Permutation in String](https://leetcode.com/problems/permutation-in-string/) | Medium | Fixed window + frequency |
| 438 | [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | Medium | Fixed window |
| 76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Hard | Variable window |

## 5. Prefix Sum & Difference Array

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 303 | [Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/) | Easy | Prefix sum |
| 724 | [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/) | Easy | Left / right sums |
| 560 | [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | Medium | Prefix + frequency map |
| 525 | [Contiguous Array](https://leetcode.com/problems/contiguous-array/) | Medium | Prefix balance |
| 1094 | [Car Pooling](https://leetcode.com/problems/car-pooling/) | Medium | Difference array |

## 6. Binary Search

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 704 | [Binary Search](https://leetcode.com/problems/binary-search/) | Easy | Standard |
| 35 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) | Easy | Lower bound |
| 34 | [Find First and Last Position](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | Medium | Boundary search |
| 33 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Medium | Modified binary search |
| 153 | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | Medium | Rotated search |
| 162 | [Find Peak Element](https://leetcode.com/problems/find-peak-element/) | Medium | Binary search on slope |
| 875 | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | Medium | Binary search on answer |
| 1011 | [Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) | Medium | Feasibility search |

## 7. Strings

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 14 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | Easy | String scan |
| 28 | [Find the Index of the First Occurrence](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | Easy | String matching |
| 5 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | Medium | Expand around center |
| 151 | [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/) | Medium | Parsing |
| 8 | [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/) | Medium | Parsing / edge cases |

## 8. Linked Lists

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | Easy | Pointer reversal |
| 21 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy | Dummy node |
| 141 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | Easy | Fast / slow |
| 142 | [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) | Medium | Floyd's algorithm |
| 19 | [Remove Nth Node From End](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Medium | Two pointers |
| 143 | [Reorder List](https://leetcode.com/problems/reorder-list/) | Medium | Middle + reverse + merge |
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Medium | Carry simulation |

## 9. Stack & Monotonic Stack

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | Matching stack |
| 155 | [Min Stack](https://leetcode.com/problems/min-stack/) | Medium | Auxiliary stack |
| 150 | [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/) | Medium | Stack evaluation |
| 739 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) | Medium | Monotonic stack |
| 496 | [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) | Easy | Monotonic stack + map |
| 84 | [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/) | Hard | Monotonic stack |
| 394 | [Decode String](https://leetcode.com/problems/decode-string/) | Medium | Stack / nested parsing |
| 402 | [Remove K Digits](https://leetcode.com/problems/remove-k-digits/) | Medium | Monotonic stack / greedy |

## 10. Queue & Deque

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 933 | [Number of Recent Calls](https://leetcode.com/problems/number-of-recent-calls/) | Easy | Queue |
| 239 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | Hard | Monotonic deque |
| 622 | [Design Circular Queue](https://leetcode.com/problems/design-circular-queue/) | Medium | Queue design |

## 11. Heap / Priority Queue / Top K

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 215 | [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) | Medium | Min heap / quickselect |
| 703 | [Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/) | Easy | Min heap |
| 973 | [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/) | Medium | Heap |
| 295 | [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) | Hard | Two heaps |
| 621 | [Task Scheduler](https://leetcode.com/problems/task-scheduler/) | Medium | Greedy + heap |

## 12. Intervals

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 56 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | Medium | Sort + merge |
| 57 | [Insert Interval](https://leetcode.com/problems/insert-interval/) | Medium | Interval insertion |
| 435 | [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/) | Medium | Greedy scheduling |

## 13. Recursion and Backtracking

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 78 | [Subsets](https://leetcode.com/problems/subsets/) | Medium | Include / exclude |
| 90 | [Subsets II](https://leetcode.com/problems/subsets-ii/) | Medium | Duplicate handling |
| 46 | [Permutations](https://leetcode.com/problems/permutations/) | Medium | Used array / swap |
| 39 | [Combination Sum](https://leetcode.com/problems/combination-sum/) | Medium | Reusable choices |
| 40 | [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) | Medium | Single use + duplicates |
| 79 | [Word Search](https://leetcode.com/problems/word-search/) | Medium | Grid backtracking |

## 14. Trees & Binary Trees

**Core patterns:** DFS recursion, preorder/inorder/postorder, level-order BFS, BST properties, path tracking, lowest common ancestor, tree construction.

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 94 | [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | Easy | DFS / stack |
| 144 | [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/) | Easy | DFS |
| 145 | [Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/) | Easy | DFS |
| 102 | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | Medium | BFS / queue |
| 104 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Easy | DFS |
| 100 | [Same Tree](https://leetcode.com/problems/same-tree/) | Easy | Recursive DFS |
| 226 | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | Easy | DFS |
| 101 | [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/) | Easy | Mirror recursion |
| 543 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) | Easy | DFS / height |
| 110 | [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/) | Easy | Bottom-up DFS |
| 112 | [Path Sum](https://leetcode.com/problems/path-sum/) | Easy | Root-to-leaf DFS |
| 113 | [Path Sum II](https://leetcode.com/problems/path-sum-ii/) | Medium | Backtracking |
| 124 | [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/) | Hard | DFS / global answer |
| 236 | [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) | Medium | Recursive DFS |
| 235 | [Lowest Common Ancestor of a BST](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | Medium | BST property |
| 98 | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | Medium | Range bounds |
| 230 | [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | Medium | Inorder |
| 701 | [Insert into a Binary Search Tree](https://leetcode.com/problems/insert-into-a-binary-search-tree/) | Medium | BST recursion |
| 105 | [Construct Binary Tree from Preorder and Inorder](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | Medium | Divide and conquer |
| 199 | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) | Medium | BFS / DFS |

**Tree revision checklist:** Know recursive DFS, iterative traversals, queue-based level order, height vs depth, BST min/max bounds, path sum, and LCA.

## 15. Graphs

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 200 | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | Medium | Grid DFS / BFS |
| 133 | [Clone Graph](https://leetcode.com/problems/clone-graph/) | Medium | DFS + HashMap |
| 994 | [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/) | Medium | Multi-source BFS |
| 695 | [Max Area of Island](https://leetcode.com/problems/max-area-of-island/) | Medium | DFS |
| 207 | [Course Schedule](https://leetcode.com/problems/course-schedule/) | Medium | Cycle detection / topo sort |
| 210 | [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/) | Medium | Topological sort |
| 547 | [Number of Provinces](https://leetcode.com/problems/number-of-provinces/) | Medium | DFS / Union-Find |
| 684 | [Redundant Connection](https://leetcode.com/problems/redundant-connection/) | Medium | Union-Find |
| 743 | [Network Delay Time](https://leetcode.com/problems/network-delay-time/) | Medium | Dijkstra |
| 127 | [Word Ladder](https://leetcode.com/problems/word-ladder/) | Hard | BFS |

## 16. Greedy

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 55 | [Jump Game](https://leetcode.com/problems/jump-game/) | Medium | Reachability |
| 45 | [Jump Game II](https://leetcode.com/problems/jump-game-ii/) | Medium | Greedy range |
| 134 | [Gas Station](https://leetcode.com/problems/gas-station/) | Medium | Greedy reset |
| 435 | [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/) | Medium | Activity selection |
| 763 | [Partition Labels](https://leetcode.com/problems/partition-labels/) | Medium | Last occurrence |

## 17. Dynamic Programming

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 70 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | Easy | 1D DP |
| 198 | [House Robber](https://leetcode.com/problems/house-robber/) | Medium | Take / skip |
| 213 | [House Robber II](https://leetcode.com/problems/house-robber-ii/) | Medium | Circular DP |
| 53 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Medium | Kadane |
| 322 | [Coin Change](https://leetcode.com/problems/coin-change/) | Medium | Unbounded knapsack |
| 518 | [Coin Change II](https://leetcode.com/problems/coin-change-2/) | Medium | Count combinations |
| 416 | [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/) | Medium | 0/1 knapsack |
| 300 | [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) | Medium | LIS |
| 1143 | [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/) | Medium | 2D DP |
| 72 | [Edit Distance](https://leetcode.com/problems/edit-distance/) | Medium | 2D DP |
| 62 | [Unique Paths](https://leetcode.com/problems/unique-paths/) | Medium | Grid DP |
| 5 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | Medium | String DP / center expansion |

## 18. Trie & Union-Find (DSU)

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 208 | [Implement Trie](https://leetcode.com/problems/implement-trie-prefix-tree/) | Medium | Trie |
| 211 | [Design Add and Search Words](https://leetcode.com/problems/design-add-and-search-words-data-structure/) | Medium | Trie + DFS |
| 547 | [Number of Provinces](https://leetcode.com/problems/number-of-provinces/) | Medium | Union-Find |
| 721 | [Accounts Merge](https://leetcode.com/problems/accounts-merge/) | Medium | Union-Find |

## 19. Bit Manipulation & Math

| # | Problem | Level | Pattern |
|---:|---|---|---|
| 136 | [Single Number](https://leetcode.com/problems/single-number/) | Easy | XOR |
| 191 | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) | Easy | Bit count |
| 338 | [Counting Bits](https://leetcode.com/problems/counting-bits/) | Easy | Bit DP |
| 50 | [Pow(x, n)](https://leetcode.com/problems/powx-n/) | Medium | Binary exponentiation |

---

## Daily workflow with LeetHub

1. Create a **public GitHub repository** named `java-dsa-placement-guide`.
2. Initialize it with a `README.md` and choose the `main` branch.
3. Install the LeetHub extension from the [Chrome Web Store](https://chromewebstore.google.com/search/LeetHub).
4. Open LeetHub and authorize your GitHub account.
5. Select your repository and enable automatic uploads. Check that the selected language/file extension is Java (`.java`) if the extension offers that setting.
6. Open a LeetCode problem and submit your Java solution.
7. After the submission shows **Accepted**, check the LeetHub status / latest synced solution and verify that a numbered problem folder and `.java` file appear in GitHub.
8. Repeat after each accepted problem. If an upload is missed, use the extension's manual sync option if available.

**Important:** LeetHub syncs accepted submissions to the repository. The curated question lists in this README are a static preparation guide; daily accepted solutions will appear as LeetHub-generated folders/files and commits. You do not need to mark which topics you have or have not studied in this README.

**README safety:** Before enabling auto-sync, keep a copy of this guide. Some LeetHub versions create or update a root `README.md` progress table. If your extension overwrites or conflicts with this guide, restore this content and keep the curated guide as `PLACEMENT_GUIDE.md`, allowing LeetHub to manage its generated `README.md`.

### Suggested note template

```text
Problem:
LeetCode link:
Pattern:
Approach:
Key observation:
Time complexity:
Space complexity:
Edge cases:
What I learned:
Revision dates:
```

## Useful resources

- [LeetCode Problemset](https://leetcode.com/problemset/)
- [LeetCode Top Interview 150](https://leetcode.com/studyplan/top-interview-150/)
- [LeetCode 75](https://leetcode.com/studyplan/leetcode-75/)
- [NeetCode Roadmap](https://neetcode.io/roadmap)
- [LeetHub on Chrome Web Store](https://chromewebstore.google.com/search/LeetHub)
- [LeetCode discussion: 14 patterns and 130 questions](https://leetcode.com/discuss/post/6853134/leetcode-14-patterns-mastery-130-questio-bx4e/)

---

## Contribution note

This repository is a pattern-wise question guide intended to help students prepare for coding interviews. Add your own explanations and Java implementations. LeetCode problem statements belong to their respective owners; link to the original problems rather than republishing full statements in this guide.

**Keep learning. Recognise patterns. Write clean Java. Revise consistently.**

<!---LeetCode Topics Start-->
# LeetCode Topics
## Stack
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0094-binary-tree-inorder-traversal) |
| [0144-binary-tree-preorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0145-binary-tree-postorder-traversal) |
## Tree
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0094-binary-tree-inorder-traversal) |
| [0100-same-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0101-symmetric-tree) |
| [0102-binary-tree-level-order-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0102-binary-tree-level-order-traversal) |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
| [0104-maximum-depth-of-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0104-maximum-depth-of-binary-tree) |
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
| [0110-balanced-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0110-balanced-binary-tree) |
| [0111-minimum-depth-of-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0111-minimum-depth-of-binary-tree) |
| [0144-binary-tree-preorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0145-binary-tree-postorder-traversal) |
| [0199-binary-tree-right-side-view](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0199-binary-tree-right-side-view) |
| [0226-invert-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0226-invert-binary-tree) |
| [0236-lowest-common-ancestor-of-a-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0236-lowest-common-ancestor-of-a-binary-tree) |
| [0543-diameter-of-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0543-diameter-of-binary-tree) |
## Depth-First Search
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0094-binary-tree-inorder-traversal) |
| [0100-same-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0101-symmetric-tree) |
| [0104-maximum-depth-of-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0104-maximum-depth-of-binary-tree) |
| [0110-balanced-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0110-balanced-binary-tree) |
| [0111-minimum-depth-of-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0111-minimum-depth-of-binary-tree) |
| [0144-binary-tree-preorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0145-binary-tree-postorder-traversal) |
| [0199-binary-tree-right-side-view](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0199-binary-tree-right-side-view) |
| [0226-invert-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0226-invert-binary-tree) |
| [0236-lowest-common-ancestor-of-a-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0236-lowest-common-ancestor-of-a-binary-tree) |
| [0543-diameter-of-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0543-diameter-of-binary-tree) |
## Binary Tree
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0094-binary-tree-inorder-traversal) |
| [0100-same-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0101-symmetric-tree) |
| [0102-binary-tree-level-order-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0102-binary-tree-level-order-traversal) |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
| [0104-maximum-depth-of-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0104-maximum-depth-of-binary-tree) |
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
| [0110-balanced-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0110-balanced-binary-tree) |
| [0111-minimum-depth-of-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0111-minimum-depth-of-binary-tree) |
| [0144-binary-tree-preorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0145-binary-tree-postorder-traversal) |
| [0199-binary-tree-right-side-view](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0199-binary-tree-right-side-view) |
| [0226-invert-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0226-invert-binary-tree) |
| [0236-lowest-common-ancestor-of-a-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0236-lowest-common-ancestor-of-a-binary-tree) |
| [0543-diameter-of-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0543-diameter-of-binary-tree) |
## Array
|  |
| ------- |
| [0001-two-sum](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0001-two-sum) |
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0001-two-sum) |
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
## Breadth-First Search
|  |
| ------- |
| [0100-same-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0101-symmetric-tree) |
| [0102-binary-tree-level-order-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0102-binary-tree-level-order-traversal) |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
| [0104-maximum-depth-of-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0104-maximum-depth-of-binary-tree) |
| [0111-minimum-depth-of-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0111-minimum-depth-of-binary-tree) |
| [0199-binary-tree-right-side-view](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0199-binary-tree-right-side-view) |
| [0226-invert-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0226-invert-binary-tree) |
## DP on Trees
|  |
| ------- |
| [0543-diameter-of-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0543-diameter-of-binary-tree) |
## Binary Lifting
|  |
| ------- |
| [0236-lowest-common-ancestor-of-a-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0236-lowest-common-ancestor-of-a-binary-tree) |
## Lowest Common Ancestor
|  |
| ------- |
| [0236-lowest-common-ancestor-of-a-binary-tree](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0236-lowest-common-ancestor-of-a-binary-tree) |
## Divide and Conquer
|  |
| ------- |
| [0105-construct-binary-tree-from-preorder-and-inorder-traversal](https://github.com/GeetikaChaudhary09/java-dsa-placement-guide/tree/master/0105-construct-binary-tree-from-preorder-and-inorder-traversal) |
<!---LeetCode Topics End-->