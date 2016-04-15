import Debug.Trace
--countsum :: Int a -> Int
countsum x = if x > 0 then x + (countsum (x - 1)) else 0
countdown x = if x > 0 then trace("x is now " ++ show x) countdown (x -1) else 0
makelist x = if x > 0 then x:(makelist (x-1)) else [0]
--sumlist x = if (length x > 0) then (head x) + (sumlist (x-1)) else 0
