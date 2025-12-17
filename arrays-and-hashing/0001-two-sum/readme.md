# 001. Two Sum

**Category:** Arrays and Hashing  
**Difficulty:** Easy  
**Language:** Java  

## Problem summary

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## Approaches

### 1. Brute force


### 2. HashMap (final solution)

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
