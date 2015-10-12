(ns hello-world.core
  (:require #_[clojure.browser.repl :as repl]
            [cljsjs.jquery]))

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(println "Hello world!")

(defn ^:export main []
  (if (js/$ "#app") (js/alert "#app found") (js/alert "#app NOT found")))
