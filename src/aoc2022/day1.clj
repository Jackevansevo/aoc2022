(ns aoc2022.core)

(def input (slurp "input/day1.txt"))

(def parsed-input (take-nth 2 (partition-by #(= "" %) (clojure.string/split-lines input))))

(defn count-cals [nums]
  (reduce + (map #(. Integer parseInt %) nums)))

(defn day1 []
  (apply max (map count-cals parsed-input)))

(defn day2 []
  (apply + (take-last 3 (sort (map count-cals parsed-input)))))

(day1)
