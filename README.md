# curly-octo-engine
Tay-scene Olly, Qian Zhou, Calvin Aw

APCS2 pd01

Lab 01 -- What does the Data Say?

## Hypothesis
For an array of size n, the worst case execution time of our search method is O(n^2).

## Background

Given an array of length n, we propose that our search algorithm will be able to sort it in quadratic
time. The QuickSort algorithm works by picking a pivot point, partitioning the array at that point, and fixing the number 
at the value of the pivot position to repeat the process with the arrays up or down from that partition point to the next partition point or the start or end. The process will repeat until every point had been fixed.

## Experiment methodology described

We started off with a randomly generated array of length 2^n from which we tested our
algorithm by running it 1000 times for each n.
This ensures that any outliers become insignificant through the numerous trials.
The time needed for the 1,000,000 trials is then stored into an array.

## Analysis
Here are some things that we deduced from QuickSort's Big-Oh runtime.

Best case: If the number at the pivot point that we pick is the median number of the array. This is because
we can split the array into two halves to deal with and continue the process. Partition runs in O(n) time
and if we continue to half the array in such a way, we will run partition in around logn times, for a total
run time of O(nlogn)

Average case: The pivot point is likely to be somewhere along the middle, so it is likely to run somewhere around O(nlogn) time.

Worst case: If the pivot point we choose is at any one of the ends of the graph, then we have to do quicksort n times as well as partition n times. This should run in O(n^2) time.

## Results

| size (n)	| time (milliseconds) | 
|---------|-------------------|
| 1000 |  | 
| 2000 |  | 
| 3000 |  | 
| 4000 |  | 
| 5000 |  | 

![alt text](https://github.com/caw024/curly-octo-engine/blob/master/graph%20from%20data%20from%20tester2.png "TIME vs SIZE")

## Conclusions
For the first 20000 test we did, the values were consistenly increasing in approximately O(nlogn) time. The outliers became prevalent as we approached higher values, which sporadically places points on the graph.