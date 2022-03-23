package ro.kofe.model.state

data class Event(val view: ViewTag, val value:Value, val extras:Map<String,Any>){
    enum class ViewTag {
        HOME_VIEW,
        GAME_VIEW,
        CHAR_VIEW
    }

    enum class Value {
        VIEW_ENTERED,
        VIEW_EXITED,
        BUTTON_PRESSED
    }
}
