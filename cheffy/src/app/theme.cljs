(ns app.theme
  (:require ["@smooth-ui/core-sc" :refer [theme]])) ;; again a String import for JS dependencies

(def cheffy-theme (merge 
                   (js->clj theme :keywordize-keys true)
                   {:black "#243B53"
                    :primary "#27AB83"
                    :secondary "#F7D070"
                    :light "#D9E2EC"
                    :borderRadius "14px"
                    :borderRadiusSm "10px"
                    :borderRadiusLg "18px"
                    :modalHeaderBorderColor "white"}))
