(ns app.core
  (:require [reagent.core :as r]
            [app.theme :refer [cheffy-theme]]
            ["@smooth-ui/core-sc" :refer [Button Normalize ThemeProvider]]))

(defn app
  []
  [:<>
   [:> Normalize]
   [:> ThemeProvider {:theme cheffy-theme}
    [:> Button {:variant "info"} "I Button"]
    [:div "Glorious!"]]])

(defn ^:dev/after-load start
  []
  (r/render [app]
            (.getElementById js/document "app")))

(defn ^:export init
  []
  (start))
