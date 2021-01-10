(ns app.core
  (:require [app.db]
            [app.nav.views.nav :refer [nav]]
            [app.theme :refer [cheffy-theme]]
            [re-frame.core :as re-frame]
            [reagent.core :as r]
            ["@smooth-ui/core-sc" :refer [Normalize ThemeProvider]])) ;; "@..." is a String import for javascript dependencies

(defn app []
  [:<> ;; this is REACT FRAGMENTS, which allows to return multiple html elements in one more or less components. Like here, Normalize and ThemeProvider apparently. Instead of wrapping the elements inside a diff and messing up the HTML dom tree: [:div[Normalize][:div "Cheffy"]]
   [:> Normalize] ;; [:> Normalize] is a short-hand for [(r/adapt-react-class Normalize)], for whatever that means ...
   [:> ThemeProvider {:theme cheffy-theme}
    ;;[:> Button {:variant "info"} "I Button"]
    [nav]]])

(defn ^:dev/after-load start
  []
  (re-frame/dispatch-sync [:initialize-db])
  (r/render [app]
            (.getElementById js/document "app"))) ;; js/document is actually the file public/index.html

(defn ^:export init ;; ^:export makes shadow-cljs not optimize the name of the function 'init' when creating the file /js/main.js that's imported in index.html, or so ...
  []
  (start))

(app)