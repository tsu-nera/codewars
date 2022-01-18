(ns codewars.core-test
  (:require [clojure.test :refer :all]
            [codewars.core :refer :all]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(deftest test-positive-sum
  (is (= (positive-sum [ ])           0))
  (is (= (positive-sum [1 2 3 4 5])  15))
  (is (= (positive-sum [1 -2 3 4 5]) 13))
  (is (= (positive-sum [-1 2 3 4 -5]) 9))
  (is (= (positive-sum [-1 -2 -3 -4 -5]) 0)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(deftest test-even-or-odd
  (is (= (even-or-odd 2) "Even") )
  (is (= (even-or-odd 0) "Even") )
  (is (= (even-or-odd 7) "Odd") )
  (is (= (even-or-odd 1) "Odd") )
  (is (= (even-or-odd -1) "Odd") ))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(deftest test-string-to-number
  (is (string-to-number "1234") 1234)
  (is (string-to-number "605") 605)
  (is (string-to-number "1405") 1405)
  (is (string-to-number "-7") -7))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(deftest test-muliply
  (testing "6 * 4 = 24"
    (is (= (multiply 6 4) 24)))
  (testing "7 * 7 = 49"
    (is (= (multiply 7 7) 49)))
  (testing "9 * 9 = 81"
    (is (= (multiply 9 9) 81)))
  (testing "11 * 11 = 121"
    (is (= (multiply 11 11) 121)))
  (testing "4 * 8 = 32"
    (is (= (multiply 4 8) 32))))
