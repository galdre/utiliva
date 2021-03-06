(defproject com.workiva/utiliva "0.1.0"
  :description "Utilia Workivinarum"
  :url "https://github.com/Workiva/utiliva"
  :license {:name "Eclipse Public License 1.0"}
  :plugins [[lein-shell "0.5.0"]
            [lein-codox "0.10.3"]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/core.cache "0.6.5"]
                 [backtick "0.3.4"]]

  :source-paths      ["src"]
  :test-paths        ["test"]

  :global-vars {*warn-on-reflection* true}

  :aliases {"docs" ["do" "clean-docs," "codox"]
            "clean-docs" ["shell" "rm" "-rf" "./documentation"]}

  :codox {:output-path "documentation"
          :namespaces :all}

  :profiles {:dev [{:dependencies [[criterium "0.4.3"]]}]})
