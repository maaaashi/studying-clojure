(ns tester.core)

(defn plus
  "This is a plus function example."
  [& args]
  (reduce + args))

(defn plus_'
  "This is a plus function example."
  [& args]
  (reduce +' args))

(defn minus
  "This is a minus function example."
  [a & args]
  (- a (reduce + args)))

(defn minus_'
  "This is a minus function example."
  [a & args]
  (-' a (reduce +' args)))

(defn sread_first
  "This is a sread_first function example."
  [x]
  (-> x (plus 5) (minus 2)))