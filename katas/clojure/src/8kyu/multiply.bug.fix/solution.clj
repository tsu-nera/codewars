(ns multiply.bug.fix)

(defn multiply [a b]
 (* a b))

;; =============

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
