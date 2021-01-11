(ns app.nav.events
  (:require [re-frame.core :refer [reg-event-db]]))

(reg-event-db ;; register an event
 :set-active-nav ;; name of the event, unique identifier
 (fn [db [_ active-nav]]
   (assoc-in db [:nav :active-nav] active-nav))) ;; 2 args: 1st: db, 2nd one a vector containing how the event is called from the client

;; how the event is triggered by the client:
;; (rf/dispatch [:set-active-nav :saved])
;; (rf/dispatch [:set-active-nav :recipe])