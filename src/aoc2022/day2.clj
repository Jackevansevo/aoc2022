(ns aoc2022.core)

(def input (clojure.string/split-lines (slurp "input/day2.txt")))

(defn solve [input]
  (case input
    "A X" (+ 1 3) ; Rock vs rock (draw)
    "A Y" (+ 2 6) ; Rock vs paper (win)
    "A Z" (+ 3 0) ; Rock vs scissors (loss)
    "B X" (+ 1 0) ; paper vs rock (loss)
    "B Y" (+ 2 3) ; paper vs paper (draw)
    "B Z" (+ 3 6) ; paper vs scissors (win)
    "C X" (+ 1 6) ; scissors vs rock (win)
    "C Y" (+ 2 0) ; scissors vs paper (loss)
    "C Z" (+ 3 3) ; scissors vs scissors (draw)
    ))

(defn solve-draw [input]
  (case input
    "A X" (+ 3 0) ; lose vs rock (scissors)
    "A Y" (+ 1 3) ; draw vs rock (rock)
    "A Z" (+ 2 6) ; win vs rock (paper)
    "B X" (+ 1 0) ; lose vs paper (rock)
    "B Y" (+ 2 3) ; draw vs paper (paper)
    "B Z" (+ 3 6) ; win vs paper (scissors)
    "C X" (+ 2 0) ; lose vs scissors (paper)
    "C Y" (+ 3 3) ; draw vs scissors (scissors)
    "C Z" (+ 1 6) ; win vs scissors (rock)
    ))

(defn part1 []
  (apply + (map solve input)))

(defn part2 []
  (apply + (map solve-draw input)))

(part2)
