countdown           :: Num a -> Num a
countdown x = if x > 0
                   then countdown x
                   else 0
length'                  :: [a] -> Integer
length' []               =  0
length' (x:xs)           =  1 + length' xs