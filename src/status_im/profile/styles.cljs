(ns status-im.profile.styles
  (:require [status-im.components.styles :refer [color-white
                                                 color-gray
                                                 color-gray4
                                                 color-gray5
                                                 color-light-gray
                                                 color-black
                                                 color-blue
                                                 color-light-blue
                                                 color-light-blue-transparent
                                                 color-blue-transparent
                                                 text1-color
                                                 text1-disabled-color
                                                 text2-color
                                                 color-red
                                                 separator-color]]
            [status-im.utils.platform :as p]))

(defn ps-profile [item]
  (get-in p/platform-specific [:component-styles :profile item]))

(def profile
  {:flex             1
   :background-color color-light-gray
   :flex-direction   :column})

(def profile-form
  {:background-color color-white})

(def profile-info-container
  {:background-color color-white
   :margin-top 16})

(def profile-bage
  (merge (ps-profile :profile-bage)
         {:align-items :center}))

(def profile-name-container
  {:margin-top 12})

(def profile-name-text
  (ps-profile :profile-name-text))

(def profile-status-container
  {:margin-top 4})

(def profile-status-text
  (merge (ps-profile :profile-status-text)
         {:color color-gray4}))

(def profile-actions-container
  {:padding-top 10})

(def profile-setting-item
  (merge (ps-profile :profile-setting-item)
         {:flex-direction :row
          :align-items    :center}))

(def profile-setting-text-container
  {:flex 1
   :padding-right 20})

(def profile-setting-title
  (merge (ps-profile :profile-setting-title)
         {:color color-gray4}))

(def profile-setting-text
  (ps-profile :profile-setting-text))

(def profile-setting-spacing
  (ps-profile :profile-setting-spacing))

(def back-btn-touchable
  {:position :absolute})

(def back-btn-container
  {:width  46
   :height 56
   :align-items     :center
   :justify-content :center})

(def back-btn-icon
  {:width       8
   :height      14})

(def actions-btn-touchable
  {:position :absolute
   :right    0})

(def actions-btn-container
  {:width           56
   :height          56
   :align-items     :center
   :justify-content :center})

(def edit-btn-icon
  {:width  4
   :height 16})

(defn ok-btn-icon [enabled?]
  {:font-size 22
   :color     (if enabled? color-black color-gray)})

(def user-photo-container
  {:margin-top 22})

(def username-wrapper
  {:width         300
   :margin-top    (if p/ios? -18 -22)
   :margin-bottom -16})

(defn username-input [edit? valid?]
  {:font-size  18
   :text-align :center
   :color      (if edit?
                 (if valid? text1-color color-red)
                 text1-disabled-color)})

(def status-block
  {:flex-direction "column"
   :align-items    "center"
   :justifyContent "center"
   :margin-left    55
   :margin-right   55})

(defn status-view [height]
  {:align-self "stretch"
   :font-size  14
   :min-height height
   :text-align "center"
   :color      text2-color})

(defn status-input [height]
  (merge (status-view height)
         {:margin-left  (if p/ios? 21 16)
          :margin-right 16
          :margin-top   (if p/ios? 6 1)}))

(defn status-text [height]
  (merge (status-view (- height (if p/ios? 5 10)))
         {:margin-left   18
          :margin-right  18
          :margin-top    11
          :margin-bottom 0}))

(def btns-container
  {:margin-top     0
   :flex-direction :row})

(def message-btn
  {:height           40
   :justify-content  :center
   :background-color color-blue
   :padding-left     25
   :padding-right    25
   :border-radius    20})

(def message-btn-text
  {:margin-top -2.5
   :font-size  14
   :color      color-white})

(def more-btn
  {:margin-left      10
   :width            40
   :height           40
   :align-items      :center
   :justify-content  :center
   :background-color color-blue-transparent
   :padding          8
   :border-radius    20})

(def more-btn-image
  {:width  4
   :height 16})

(def profile-properties-container
  {:align-items    :stretch
   :flex-firection :column
   :margin-top     16})

(def my-profile-properties-container
  {:align-items    :stretch
   :flex-firection :column
   :margin-top     32})

(def profile-property
  {:margin-left 16})

(def profile-property-with-top-spacing
  {:margin-top  32
   :margin-left 16})

(def profile-property-row
  {:flex           1
   :flex-direction :row})

(def profile-property-field
  {:margin-right 96
   :flex         1})

(def report-user-text
  {:font-size      14
   :line-height    21
   :color          text2-color
   ;; IOS:
   :letter-spacing 0.5})

(def qr-code
  {:width            250
   :height           250
   :background-color "white"
   :border-radius    4
   :align-items      :center
   :padding-top      15
   :elevation        4})

(def underline-container
  {:background-color separator-color
   :margin-bottom    18
   :height           1
   :align-items      :center})

(def add-to-contacts
  {:margin-top 24
   :margin-left 16
   :margin-right 16
   :background-color color-light-blue
   :border-radius 4
   :height 52
   :align-items :center
   :justify-content :center})

(def in-contacts
  (merge add-to-contacts
         {:flex-direction :row
          :padding-right 40
          :padding-left 16
          :justify-content :flex-start
          :background-color color-light-blue-transparent}))

(def in-contacts-inner
  {:align-items :center
   :flex 1})

(def add-to-contacts-text
  (if p/ios?
    {:color color-white
     :font-size 17
     :line-height 20
     :letter-spacing -0.2}
    {:color color-white
     :font-size 14
     :letter-spacing 0.5}))

(def in-contacts-text
  (merge add-to-contacts-text
         {:color color-light-blue}))

;;TODO should be moved to components
;;TODO ===============================
(def settings-group-text
  (if p/ios?
    {:color          color-light-blue
     :letter-spacing -0.2
     :font-size      17
     :line-height    20}
    {:color          color-black
     :font-size      16
     :line-height    24}))


(def settings-group-text-container
  {:padding-left 16})

(def settings-icon-container
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


(def settings-group-item
   {:padding-left   16
    :height         64
    :flex-direction :row
    :align-items    :center})

(def settings-separator
  (if p/ios?
    {:margin-left      16
     :height           1
     :background-color color-gray5
     :opacity          0.5}))

(def share-qr-separator
  {:margin-top       24
   :height           1
   :background-color color-gray5
   :opacity          0.5})
;;TODO ===============================
