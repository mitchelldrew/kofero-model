package ro.kofe.model

class Character(id:Int, val name:String, val health:Int, val moveIds:List<Int>, val iconUrl:String): Obj(id) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Character) return false
        if (!super.equals(other)) return false

        if (name != other.name) return false
        if (health != other.health) return false
        if (moveIds != other.moveIds) return false
        if (iconUrl != other.iconUrl) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + health
        result = 31 * result + moveIds.hashCode()
        result = 31 * result + iconUrl.hashCode()
        return result
    }

    override fun toString(): String {
        return "Character(name='$name', health=$health, moveIds=$moveIds, iconUrl='$iconUrl')"
    }
}
