package ro.kofe.model

open class Obj(val id:Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Obj) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }

    override fun toString(): String {
        return "Obj(id=$id)"
    }
}
