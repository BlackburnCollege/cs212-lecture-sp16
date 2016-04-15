-- author: Joshua B. Gross
-- this shows some simple haskell functions with defined types
-- these are generally not necessary with
-- {-# LANGUAGE ImplicitParams #-}
-- on the first line of the haskell file
countdown           :: Num a -> Num a
countdown x = if x > 0
                   then countdown x
                   else 0
length'                  :: [a] -> Integer
length' []               =  0
length' (x:xs)           =  1 + length' xs