(ns solsort.alive.main
  (:require-macros
   [reagent.ratom :as ratom]
   [cljs.core.async.macros :refer [go go-loop alt!]])
  (:require
   [solsort.misc :refer [<blob-url]]
   [solsort.util
    :refer
    [<p <ajax <seq<! js-seq normalize-css load-style! put!close!
     parse-json-or-nil log page-ready render dom->clj next-tick]]
   [reagent.core :as reagent :refer []]
   [cljs.core.async :as async :refer [>! <! chan put! take! timeout close! pipe]]))

(defn main []
  [:h1 [:small "I'm "] "ALIVE"])

(render [main])
