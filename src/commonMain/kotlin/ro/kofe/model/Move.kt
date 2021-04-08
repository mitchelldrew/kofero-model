package ro.kofe.model

class Move(id:Int, val name:String, val startup:String, val active:String, val recovery:String, val hitAdv:String, val blockAdv:String, val notes:String): Obj(id) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Move) return false
        if (!super.equals(other)) return false

        if (name != other.name) return false
        if (startup != other.startup) return false
        if (active != other.active) return false
        if (recovery != other.recovery) return false
        if (hitAdv != other.hitAdv) return false
        if (blockAdv != other.blockAdv) return false
        if (notes != other.notes) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + startup.hashCode()
        result = 31 * result + active.hashCode()
        result = 31 * result + recovery.hashCode()
        result = 31 * result + hitAdv.hashCode()
        result = 31 * result + blockAdv.hashCode()
        result = 31 * result + notes.hashCode()
        return result
    }

    override fun toString(): String {
        return "Move(name='$name', startup='$startup', active='$active', recovery='$recovery', hitAdv='$hitAdv', blockAdv='$blockAdv', notes='$notes')"
    }
}
