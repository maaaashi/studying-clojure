(ns tester.core)

(defn plus
  "This is a plus function example."
  [& args]
  (reduce + args))

(defn plus_arbitrary
  "This is a plus function example."
  [& args]
  (reduce +' args))

(defn minus
  "This is a minus function example."
  [a & args]
  (- a (reduce + args)))