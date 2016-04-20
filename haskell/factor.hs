{-# LANGUAGE ImplicitParams #-}
import Debug.Trace

isEven x
    | x `mod` 2 == 0 = True
    | otherwise = False

isEvenlyDivisibleBy x y 
    | x `mod` y == 0 = True
    | otherwise = False

isEven' x = isEvenlyDivisibleBy x 2

bp x
    | isEvenlyDivisibleBy x 2 = 1
    | isEvenlyDivisibleBy x 5 = 5
    | otherwise = 0

{-
public class Bar...
public void foo (int x, String y);
public static void foo (int x, String y);

Bar.foo(1, "Hunter");
Bar b = new Bar...
b.foo(1, "Hunter");

private  int foo (int x, String y);

public void foo (String y, int x);
-}

findFactors x = findFactors' x x

-- this doesn't work - why not?
findFactors' x y 
    | isEvenlyDivisibleBy x y = 
--        traceShow(x, y) $ 
        y:(findFactors' x (y-1))
    | y > 1 = findFactors' x (y-1)
    | otherwise = [1]