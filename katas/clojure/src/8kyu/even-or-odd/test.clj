;; https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/clojure

(ns example-test
  (:require [clojure.test :refer :all]
            [kata :refer :all]))

(deftest Examples...
  (is (= (even-or-odd 2) "Even") )
  (is (= (even-or-odd 0) "Even") )
  (is (= (even-or-odd 7) "Odd") )
  (is (= (even-or-odd 1) "Odd") )
  (is (= (even-or-odd -1) "Odd") )
  )
