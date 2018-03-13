# curly-octo-engine
Tay-scene Olly, Qian Zhou, Calvin Aw

APCS2 pd01

Lab 01 -- What does the Data Say?

## Hypothesis
For an array of size n, the worst case execution time of our search method is O(n^2).

## Background

Given an array of length n, we propose that our search algorithm will be able to sort it in quadratic
time. The QuickSort algorithm works by picking a pivot point, partitioning the array at that point, and fixing the number 
at the value of the pivot position to repeat the process with the arrays up or down from that partition point to the next partition point or the start or end. The process will repeat until every point had been fixed. The maximum number of moves 

## Experiment methodology described

We started off with a randomly generated 1000x1000 matrix from which we tested our
algorithm by running it 1,000,000 times in a row, searching for random values each time.
This ensures that any outliers become insignificant thoough the numerous trials.
The time needed for the 1,000,000 trials is then stored into an array.
The process is repeated for the other n x n arrays with n incrementing by 1000 up to
15000x15000.

## Results

| size (n)	| time (milliseconds) | 
|---------|-------------------|
| 1000 |  | 
| 2000 |  | 
| 3000 |  | 
| 4000 |  | 
| 5000 |  | 
