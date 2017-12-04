(defstruct rectangle (width 0) (height 0))

(defmethod area ((figure rectangle))
       (* (rectangle-height figure)
          (rectangle-width figure)))
