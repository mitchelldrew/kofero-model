package ro.kofe.model

data class Game(val id:Int, val name:String, val characterIds:Array<Int>, val iconUrl:String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Game

        if (id != other.id) return false
        if (name != other.name) return false
        if (!characterIds.contentEquals(other.characterIds)) return false
        if (iconUrl != other.iconUrl) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        result = 31 * result + characterIds.contentHashCode()
        result = 31 * result + iconUrl.hashCode()
        return result
    }
}