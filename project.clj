(defproject clojurec "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/tools.cli "0.2.2"]]
  :source-paths ["src/clj" "src/cljc"]
  :test-paths ["test/clj"]
  :main ^:skip-aot cljc.driver)
