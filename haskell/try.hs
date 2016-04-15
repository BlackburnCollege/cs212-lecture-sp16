{-# LANGUAGE ImplicitParams #-}
import Debug.Trace

-- just a convenient label for a list (convenient list - cl)
cl = [1, 3, 5, 7, 9]

-- from N counting down by one to 0, add each N
countsum x = if x > 0 then x + (countsum (x - 1)) else 0

-- count down from N to 0, printing each x on its own line with the debugger
countdown x = if x > 0 then countdown (x -1) else 0

-- count down from N to 0, printing each x on its own line with the debugger
-- note the different function name (spoken as countdown-prime). 
countdown' x = if x > 0 then trace("x is now " ++ show x) $ (countdown' (x -1)) else 0

-- given N, make a list of length N with elements [N, N-1, ..., 0]
makelist x = if x > 0 then x:(makelist (x-1)) else [0]

-- given a list, add create a copy with each element having 5 added
add5 x = if length x > 0 then (head x + 5):(add5 (tail x)) else []

-- same function (note different name) that uses the head:tail syntax
add5' (x:xs) = if length xs > 0 then  (x + 5):(add5' xs) else [x+5]

-- same function (note different name) but with debug printing
-- note that because the printing is outside the if->then, we need a $
-- to join the first operation (trace...) with the second (if...)
add5'' (x:xs) = (trace("\nx is now "++ show x)) $ (if length xs > 0 then  (x + 5):(add5'' xs) else [x+5])

-- probably self-explanatory
add6 (x:xs) = if length xs > 0 then (x + 6):(add6 xs) else [x+6]

-- same function (note different name) but with debug printing
-- Or DOES IT have debug printing? (hint: not really) Why not?
add6' (x:xs) = (trace("\nx is now "++ show x)) $ (if length xs > 0 then  (x + 6):(add6 xs) else [x+5])

-- of course, we don't need to only add a fixed number
addN (x:xs) y = if length xs > 0 then (x + y):(addN xs y) else [x+y]

-- To Infinity and Beyond - what does it do? give it a run
tiab x = (traceShow x) (tiab (x-1))

-- will this work? why or why not?
--sumlist x = if (length x > 0) then (he ad x) + (sumlist (x-1)) else 0