# 242. Valid Anagram

**Category:** Arrays and Hashing  
**Difficulty:** Easy  
**Language:** Java  

## Problem summary

Given an integer array `nums`, return `true` if any value appears at least twice, and `false` if every element is distinct.

## Approaches

### 1. Brute force

- Check all pairs with two nested loops  
- Time: O(n^2)  
- Space: O(1)  
- Too slow for large `n`

### 2. HashSet (final solution)

- Iterate through the array and insert into a HashSet  
- If value is already in the set, return `true`  
- Time: O(n) average  
- Space: O(n)  

This is what `Solution.java` uses.

## Notes

- Good warmup for HashMap / HashSet pattern
- Same pattern shows up in:
  - "Contains Duplicate II"
  - "Valid Anagram"
  - "Two Sum" (with slight modification)
