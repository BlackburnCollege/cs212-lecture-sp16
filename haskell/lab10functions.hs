--average x = (sum x) `div` (length x)
countdown           :: Num a -> Num a
countdown x = if x > 0
                   then countdown x
                   else 0
--add5 :: [a] -> [a]
--add5 [] = []
--add5 x = ((head x) + 5):(add5 x)
length'                  :: [a] -> Integer
length' []               =  0
length' (x:xs)           =  1 + length' xs
--printElem                :: [a] -> IO()
--printElem []             = print 0
--printElem (x:xs)         = do print x
--                              printElem xs

--jbsum                    :: [a] -> Integer
--jbsum []                 = 0
--jbsum (x:xs)             = x + jbsum xs

--add5                     :: [Num a] -> [Num a]
--add5 []                  = []
--add5 x                   = ((head x) + 5):(add5 x)
