(ns multiply.bug.fix-test
  (:require [clojure.test :refer :all]
            [multiply.bug.fix :refer :all]))
            
(deftest Multiply-Test
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