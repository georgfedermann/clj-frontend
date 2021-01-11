;; this now is actually a small component for re-use
;; partly introduced due to problems with using the (:> syntax within a clojure loop

(ns app.nav.views.nav-item
  (:require ["@smooth-ui/core-sc" :refer [Box]]))

(defn nav-item [{:keys [id href name]}]
  ;; this returns a box element
     [:> Box {:key id
              :as "a"
              :href href
              :ml 2  ;; margin-left
              :pb 10} ;; padding-bottom
      name])
