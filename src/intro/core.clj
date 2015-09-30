(ns intro.core)

;; http://clojure.org/data_structures

;; Primitive data types ========================================================

;; nil
nil

(nil? nil)
(nil? 123)

;; Numbers
1
2.3
3/2345

(= 1 1 1 1 2)
(+ 1 1 1 2)
(/ 1 2)

;; Boolean
true
false

(if true "yes" "no")
(if false "yes" "no")

(if [] "yes" "no")
(if 0 "yes" "no")

(when false
    (println "hello"))

;; Strings
"Hello World!"

(str 123)
(str [1 2 3])
(str "Hello " "Bob")
(count "abcd")
(clojure.string/join ", " [1 2 3])

;; Keywords (very fast equality tests)
:company

(= :a :a)
(:a {:a 10})
(:b {:a 10} :default)

;; Symbols (normally used to refer to something else)
'blue

(def x 123)
x

(let [a 10
      x 20]
  x)

(def !!! 10)
!!!

;; var x = 10;

x

(defn greet [name]
  (str "Hello " name))

(filter (fn [x] (= x 10)) (range 1000))
(filter #(= % 10) (range 1000))

(defn get-x [coord]
  (coord 0))

(defn get-x [[x _]]
  x)

(= (/ 1 2) 0.5)

(get-x [1 2])

(greet "Alice")

;; Collections =================================================================

;; Lists (linked list)
'(1 2 3)

(range 10)
(take 5 (range 10))
(drop 5 (range 10))
(rand-int 10)
(rand)
(range 5 10)
(take 100 (range))
(conj '(1 2 3) 4)
(concat '(1 2) '(3 4))

;; Vectors (fast access to given index)
[1 2 3]
(conj [1 2 3] nil)
(vector? [1 2 3])
(vec '(1 2 3))

;; Maps (key/value pairs)
(def m {:name "John Doe"
        :age 28})

(:name m)
(assoc m :age 29)
(update-in m [:age] inc)

;; Sets
#{1 2 3}

(filter #{2 5} (range 20))
(map inc (range 10))
(map greet ["Alice" "Bob"])

(do
  (println "doing something")
  (+ 1 1))

(conj #{1 2} 3)
(disj #{1 2} 2)

;; Functions ===================================================================
;; Many functions defined on few primary data structures.

;; How do I call a function? Lisp...

;; Destructuring

;; do block

;; Loops / Recursion

;; LightTable

(loop [xs (range 10)
       result []]
  (if (not-empty xs)
    (recur (rest xs) (conj result (inc (first xs))))
    result))

(map inc (range 10))
