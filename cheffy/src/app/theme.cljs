(ns app.theme
  (:require ["@smooth-ui/core-sc" :refer [theme]]))

(def cheffy-theme (merge 
                   (js->clj theme :keywordize-keys true)
                   {:black "#243B53"
                    :primary "#27AB83"
                    :secondary "#F7D070"
                    :light "#D9E2EC"
                    :borderRadius "14px"
                    :borderRasuisSm "10px"
                    :borderRasiusLg "18px"
                    :modalHeaderBorderColor "white"}))
