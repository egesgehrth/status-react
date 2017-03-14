(ns status-im.components.action-button.styles
  (:require [status-im.utils.platform :as p]
            [status-im.components.styles :refer [color-white color-light-blue-transparent color-light-blue color-black]]))

(def action-button
  {:padding-left   16
   :height         64
   :flex-direction :row
   :align-items    :center})

(def action-button-icon-container
  (if p/ios?
    {:background-color color-light-blue-transparent
     :border-radius    50
     :width            40
     :height           40
     :align-items      :center
     :justify-content  :center}
    {:border-radius    50
     :width            40
     :height           40
     :align-items      :center
     :justify-content  :center}))

(def action-button-label-container
  {:padding-left 16})

(def action-button-label
  (if p/ios?
    {:color          color-light-blue
     :letter-spacing -0.2
     :font-size      17
     :line-height    20}
    {:color          color-black
     :font-size      16
     :line-height    24}))

(def action-separator-wrapper
  {:background-color color-white})

(def action-separator
  (get-in p/platform-specific [:component-styles :contacts :separator]))

