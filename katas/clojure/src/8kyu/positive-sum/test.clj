;; https://www.codewars.com/kata/5715eaedb436cf5606000381/train/clojure

(ns kata.test
  (:require [clojure.test :refer :all]
            [kata         :refer [positive-sum]]))

(deftest basic-tests
  (is (= (positive-sum [ ])           0))
  (is (= (positive-sum [1 2 3 4 5])  15))
  (is (= (positive-sum [1 -2 3 4 5]) 13))
  (is (= (positive-sum [-1 2 3 4 -5]) 9))
  (is (= (positive-sum [-1 -2 -3 -4 -5]) 0)))
