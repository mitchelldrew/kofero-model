package ro.kofe.model

class Game(uid: Int, val name:String, val characterIds:List<Int>, val iconUrl:String): Obj(uid) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Game) return false
        if (!super.equals(other)) return false

        if (name != other.name) return false
        if (characterIds != other.characterIds) return false
        if (iconUrl != other.iconUrl) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + characterIds.hashCode()
        result = 31 * result + iconUrl.hashCode()
        return result
    }

    override fun toString(): String {
        return "Game(uid='$uid', name='$name', characterIds=$characterIds, iconUrl='$iconUrl')"
    }
}