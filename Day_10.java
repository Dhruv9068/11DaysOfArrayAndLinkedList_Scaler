// #Problem #Statement
//  Merged Intervals

// The problem involves merging overlapping intervals in an ArrayList of Interval objects. You are provided with an initial list of intervals and a new interval to be inserted. The goal is to modify the list such that:

// 1. Intervals are sorted by the starting time.
// 2. Overlapping intervals are merged into a single interval with the combined starting and ending times.
// 3. Non-overlapping intervals are preserved in their original order.

// example :
// List of intervals: [[1,3], [6,9]]
// New interval: [2,5]
// Merged intervals: [[1,5], [6,9]]

import java.util.*;

class Interval {
    int start;
    int end;
    
    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();
        int i = 0;
        
        // Add non-overlapping intervals before newInterval
        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
            result.add(intervals.get(i));
            i++;
        }
        
        // Merge overlapping intervals
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;
        }
        
        result.add(newInterval);
        
        // Add non-overlapping intervals after newInterval
        while (i < intervals.size()) {
            result.add(intervals.get(i));
            i++;
        }
        
        return result;
    }
    
}
