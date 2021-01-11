(ns app.nav.views.nav
  (:require [app.nav.views.authenticated :refer [authenticated]]))

(defn nav []
  (let [user true] ;; later on 'user' will be a subscription, for now just mock it
    (if user
      [authenticated]
      "public")))
