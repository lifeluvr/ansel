(ns gallery.util
  (:require [clojure.java.io :refer [file]]
            [cheshire.core :refer :all]))

(defn exists? [path]
  (.exists (file path)))

(defn cwd []
  (.getCanonicalFile (file ".")))

(defn minutes [m]
  (* m 60 1000))

(defn pretty-json [m]
  (generate-string m {:pretty true}))
