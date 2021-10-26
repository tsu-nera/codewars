(ns rock-paper-scissors)

(def winner-states
  {"rock" "scissors"
   "scissors" "paper"
   "paper" "rock"})

(defn rps
  ([player1 player2]
   (cond
     (= player1 player2) "Draw!"
     (= (get winner-states player1) player2) "Player 1 won!"
     (= (get winner-states player2) player1) "Player 2 won!"
     :else "Are you playing rock paper scissors lizard spock?"
     )))

;; 学習素材
;; https://www.youtube.com/watch?v=H-g9ys18jic
;; https://github.com/practicalli/codewars-guides/tree/develop/rock-paper-scissors
;; https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/clojure

;; ===================================
;; 学習メモ

;; 2021.10.26

;; youtubeの再生場所を覚えておきたいな

;; extendedのゲームはみるだけでいいや

;; 飽きたなw やめるか...

;; とりあえず提出したので完了

;; 2021.10.24

;; もうどんどんコードに学習メモを残していこう.
;; これはDesign Journalというらしい.
;; https://practical.li/spacemacs/repl-driven-development/#design-journal

;; * monokaiの日本語コメントがちょっと薄い気がする.
;; -> たぶんwindows環境だけで調整が必要、保留
;; * カッコの移動をもっとスムーズにしたいな.
;; * 関数の補完も効かせたい.
;; * OSの変換をするとき、白くなると変換候補がみえない.
;; * Emacsの入力はEmacsのIMEがいいのかな?

;; どうしようかな、疑問点はひとつずつつぶしていくかな. まあいいや。

;; HashMapは {} で定義する。
(def winner-states
  {"rock" "scissors"
   "scissors" "paper"
   "paper" "rock"})

;; 関数はdefnだけど、定数はdefなのかな？

;; (rock-paper-scissors-game "rock" "scissors") 

;; ここまでにしてあとは簡単な改善を覚える。 
;; * カーソル位置の単語を削除
;; M-b で単語の先頭に移動して、M-dで単語を削除するのがEmacs-way

;; Emacsで日本語が起動してしまったら、C-\ (右小指のあたり)

;; mark-setは c-@
;; 削除とかで役に立ちそう。だんだん思い出してきた。
