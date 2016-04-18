{-# LANGUAGE ImplicitParams #-}
import Debug.Trace

-- just a useful label for a convenient list (hence cl)
cl = [1, 3, 5, 7, 9]

-- takes in a number x and adds up all numbers between x and 0
countsum x = if x > 0 then x + (countsum (x - 1)) else 0

-- takes a number x and counts down from x to 0, using debugging to print out
countdown x = if x > 0 then trace("x is now " ++ show x) countdown (x -1) else 0

-- takes a number x and creates a list with x number of elements by consing x
-- to the left of the list, then recursing with x-1 until x == 0
-- this is basically the same as countdown, except creating a list
makelist x = if x > 0 then x:(makelist (x-1)) else []

-- takes a list and creates a new list with a copy of each element from the
-- original list with 5 added to that element
add5 x = if length x > 0 then (head x + 5):(add5 (tail x)) else []

-- basically the same function as add5 (though note the name difference) and
-- printing out debugging info, and using the (x;xs) notation instead of head x
add5' (x:xs) = (trace("\nx is now "++ show x)) $ (if length xs > 0 then (x + 5):(add5' xs) else [x+5])

-- same function as add5, but this time we're taking a list and creating a new
-- list with 6 added to every element - mindblowing, huh?
add6 (x:xs) = if length xs > 0 then (x + 6):(add6 xs) else [x+6]

-- same function as add5', taking a list and creating a new list with 6
-- added to every element - mindblowing, huh - but the debug doesn't work - why?
add6' (x:xs) = (trace("\nx is now "++ show x)) $ (if length xs > 0 then (x + 5):(add6 xs) else [x+6])

-- take a list and a number, create a new copy of that list with the number 
-- added to each element; we don't want to write add1, add2, ... add100...
addN (x:xs) y = if length xs > 0 then (x + y):(addN xs y) else [x+y]

-- To Infinity and Beyond! 
tiab x = (traceShow x) (tiab (x-1))

-- will this work? why or why not?
--sumlist x = if (length x > 0) then (head x) + (sumlist (x-1)) else 0

