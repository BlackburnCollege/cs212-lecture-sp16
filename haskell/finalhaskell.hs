{-# LANGUAGE ImplicitParams #-}
import Debug.Trace

isMultipleOfTen x = if x `mod` 10 == 0 then True else False

square x = x * x

apply f x
    | length x == 0 = []
    | otherwise = (f (head x)):(apply f (tail x))

{-
isZero 0 = True
isZero 1 = False
isZero x = False
-}

