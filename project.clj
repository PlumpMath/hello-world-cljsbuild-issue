(defproject hello-world "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.122"]
                 [cljsjs/jquery "1.9.1-0"]]
  :plugins [[lein-cljsbuild "1.1.0"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]

  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target"
  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src"]
                        :compiler {:main hello-world.core
                                   :output-to "dev-resources/public/js/compiled/hello_world.js"
                                   :output-dir "dev-resources/public/js/compiled/out"
                                   :asset-path "js/compiled/out"
                                   :source-map-timestamp true}}

                       {:id "min"
                        :verbose true
                        :source-paths ["src"]
                        :compiler {:main hello-world.core
                                   :output-to "resources/public/js/compiled/hello_world.js"
                                   :optimizations :advanced
                                   :pretty-print false}}]})
