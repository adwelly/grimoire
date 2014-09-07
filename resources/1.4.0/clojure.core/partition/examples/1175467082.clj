user=> (partition 4 (range 20))
((0 1 2 3) (4 5 6 7) (8 9 10 11) (12 13 14 15) (16 17 18 19))

user=> (partition 4 (range 22))
((0 1 2 3) (4 5 6 7) (8 9 10 11) (12 13 14 15) (16 17 18 19))

user=> (partition 4 6 (range 20))
((0 1 2 3) (6 7 8 9) (12 13 14 15))

user=> (partition 4 6 ["a"] (range 20))
((0 1 2 3) (6 7 8 9) (12 13 14 15) (18 19 "a"))

user=> (partition 4 6 ["a" "b" "c" "d"] (range 20))
((0 1 2 3) (6 7 8 9) (12 13 14 15) (18 19 "a" "b"))