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
  {:background-color color-white
   :padding-bottom   24})

(def edit-my-profile-form
  {:background-color color-white
   :flex             1})

(def profile-info-container
  {:background-color color-white
   :margin-top 16})

(def profile-bage
  (merge (ps-profile :profile-bage)
         {:align-items :center}))

(def edit-profile-bage
  {:flex-direction :row
   :align-items    :center
   :padding-left   24
   :padding-top    25})

(def profile-name-container
  {:margin-top 12})

(def edit-profile-name-container
  {:padding-left 32
   :flex 1})

(def edit-name-title
  {:color color-gray4
   :font-size 13
   :letter-spacing -0.1})

(def edit-status-title
  edit-name-title)

(def profile-name-text
  (ps-profile :profile-name-text))

(def profile-status-container
  {:margin-top 4})

(def profile-status-text
  (merge (ps-profile :profile-status-text)
         {:color color-gray4}))

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

(def add-to-contacts
  {:margin-top 18
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

(def info-item-separator
  (if p/ios?
    {:margin-left      16
     :height           1
     :background-color color-gray5
     :opacity          0.5}))

(def form-separator
  {:height           1
   :background-color color-gray5
   :opacity          0.5})


(def profile-name-wrapper
  {:padding-top    0
   :height         40
   :padding-bottom 0})

(def profile-focus-line-color
  (get-in p/platform-specific [:group-chat-focus-line-color]))

(def profile-focus-line-height
  (get-in p/platform-specific [:group-chat-focus-line-height]))

(def profile-name-input
  {:font-size      17
   :letter-spacing -0.2
   :color          text1-color})

(def profile-status-input
  (merge profile-name-input
         {:height 75}))
