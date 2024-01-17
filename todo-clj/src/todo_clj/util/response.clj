(ns todo-clj.util.response
  (:require [ring.util.response :as res]))

(def response #'res/respons)
(alter-meta! #'response #(merge % (meta #'res/respons)))

(defn html [res]
  (res/content-type res "text/html; charset=utf-8"))