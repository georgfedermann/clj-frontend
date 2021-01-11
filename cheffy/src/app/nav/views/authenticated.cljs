(ns app.nav.views.authenticated
  (:require [app.nav.views.nav-item :refer [nav-item]]
   ["@smooth-ui/core-sc" :refer [Box]])) ;; Box is basically a div with exposed css properties

(defn authenticated [] ;; will return a box with a couple of
  (let [nav-items [{:id :saved
                    :name "Saved"
                    :href "#saved"
                    :dispatch (rf/dispatch [:set-active-nav :saved])}
                   {:id :recipes
                    :name "Recipes"
                    :href "#recipes"}
                   {:id :inbox
                    :name "Inbox"
                    :href "#inbox"}
                   {:id :become-a-chef
                    :name "Chef"
                    :href "#become-a-chef"}
                   {:id :profile
                    :name "Profile"
                    :href "#profile"}]]
  [:> Box {:display "flex"
           :justify-content "flex-end"
           :py 1} ;; padding-y
   (for [item nav-items]
     [nav-item item])]))
