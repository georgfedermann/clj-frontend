(ns app.core
  (:require [app.db]
            [app.nav.views.nav :refer [nav]]
            [app.theme :refer [cheffy-theme]]
            [re-frame.core :as re-frame]
            [reagent.core :as r]
            ["@smooth-ui/core-sc" :refer [Normalize ThemeProvider]]))

(defn app
  []
  [:<>
   [:> Normalize]
   [:> ThemeProvider {:theme cheffy-theme}
    ;;[:> Button {:variant "info"} "I Button"]
    [nav]]])

(defn ^:dev/after-load start
  []
  (re-frame/dispatch-sync [:initialize-db])
  (r/render [app]
            (.getElementById js/document "app")))

(defn ^:export init
  []
  (start))
