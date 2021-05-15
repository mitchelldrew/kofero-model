package ro.kofe.model

class Move(uid:Int, val name:String, val attributes:Map<String,String>): Obj(uid) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Move) return false
        if (!super.equals(other)) return false

        if (uid != other.uid) return false
        if (name != other.name) return false
        if (attributes != other.attributes) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + attributes.hashCode()
        return result
    }

    override fun toString(): String {
        return "Move(uid='$uid', name='$name', attributes=$attributes)"
    }

}
