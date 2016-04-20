{-# LANGUAGE ImplicitParams #-}
import Debug.Trace

isEven x
    | x `mod` 2 == 0 = True
    | otherwise = False

isEven' x = isEvenlyDivisibleBy x 2

isEvenlyDivisibleBy x y 
    | x `mod` y == 0 = True
    | otherwise = False

findFactors x = findFactors' x x

-- this doesn't work - why not?
findFactors' x y 
    | isEvenlyDivisibleBy x y = 
--        traceShow(x, y) $ 
        y:(findFactors' x (y-1))
    | y > 1 = findFactors' x (y-1)
    | otherwise = [1]