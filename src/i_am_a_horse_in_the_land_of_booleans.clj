(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil) false
     (if (= x false) false true
      )
    )
  )

(defn abs [x]
  (if (< x 0) (* -1 x) x)
  )

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false)
  )

(defn fizzbuzz [n]
  (cond
   (= (mod n 15) 0) "gotcha!"
   (= (mod n 3) 0) "fizz"
   (= (mod n 5) 0) "buzz"
   :else ""))

(defn teen? [age]
  (if (and (> age 12) (< age 20)) true false)
  )

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (= (mod year 400) 0) true
   (= (mod year 100) 0) false
   (= (mod year 4) 0) true
   :else false))

; '_______'
