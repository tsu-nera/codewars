(ns codewars.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

;; ======
;; 8kyu
;; ======
;;
;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Sum of positive
;; https://www.codewars.com/kata/5715eaedb436cf5606000381/train/clojure
(defn positive-number? [x]
  (> x 0))

(defn positive-sum [xs]
  (reduce + (filter #(> % 0) xs)))

 ; 2021.11.01
;; Emacs力をあげて戻ってきたので、再びこの問題に取り組む。

;;; 2021.10.21
;; https://www.codewars.com/kata/5715eaedb436cf5606000381/train/clojure

;; You get an array of numbers, return the sum of all of the positives ones.
;; Example [1,-4,7,12] => 1 + 7 + 12 = 20
;; Note: if there is nothing to sum, the sum is default to 0.

;; なんか毎日取り組んでいるけどいろいろな不自由があるので
;; 先にそれを片付けていったほうがいいのかも

;; とくにSpacemacsの使い方になれていないため、
;; 問題を解く以前に編集操作に戸惑うのは効率が悪い

;; 先に基本的なREPL開発をみにつけて編集操作も難なくこなせるようにするかな
;; というわけで、10.21で一旦止める。またここに戻ってくるよ。

;; ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Even or Odd
;; https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/train/clojure
(defn even-or-odd [number]
  (if (even? number) "Even" "Odd"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Convert a String to a Number!
;; https://www.codewars.com/kata/544675c6f971f7399a000e79/train/clojure
(defn string-to-number [str]
  (Integer/parseInt str))

;; ====================================================
;; Multiply
;; url: https://www.codewars.com/kata/50654ddff44f800200000004/train/clojure
(defn multiply [a b]
 (* a b))

;; 2022.01.19
;; 再び戻ってきた.
;; 全てを単一のcore.cljとtest_core.cljに記述していく.
;;
;; 2021.10.26
;; これに対応するテストコードを動かす

;; まずはsolutionとtestのコードをコマンドで切り替えたい

;; https://qiita.com/xorphitus/items/a1f433fa6ba2489ff9cf#%E3%83%86%E3%82%B9%E3%83%88%E3%81%AE%E5%AE%9F%E8%A1%8C%E3%81%AB%E3%81%A4%E3%81%84%E3%81%A6
;; clojure-test-modeはCIDER 0.7の時点でCIDERに吸収されてdepricatedとなった。
;; CIDER上でテストを実行する一番単純な方法は、REPLでテストコードを評価した上で、テスト対象のファイルを開いたバッファにてC-c ,することだ。
;; そうすると、同ファイルに対応するテストが実行される。

;; いけたぞ？！
;; test.cljを src配下からtest配下に移動した
;; C-c / ESC-m m でどうやらciderのメニューがでるな
;; test を replおくったらできた、 送らないと実行できない
