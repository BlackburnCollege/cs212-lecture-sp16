{-# LANGUAGE ImplicitParams #-}
import Debug.Trace
tl = [1, 3, 5, 7, 9]
countsum x = if x > 0 then x + (countsum (x - 1)) else 0
countdown x = if x > 0 then trace("x is now " ++ show x) countdown (x -1) else 0
makelist x = if x > 0 then x:(makelist (x-1)) else [0]
add5 (x:xs) = (trace("\nx is now "++ show x)) $ (if length xs > 0 then  (x + 5):(add5 xs) else [x+5])
add6 (x:xs) = if length xs > 0 then (x + 6):(add6 xs) else [x+6]
add5' x = if length x > 0 then (head x + 5):(add5 (tail x)) else []
addN (x:xs) y = if length xs > 0 then (x + y):(addN xs y) else [x+y]
-- will this work? why or why not?
--sumlist x = if (length x > 0) then (head x) + (sumlist (x-1)) else 0
