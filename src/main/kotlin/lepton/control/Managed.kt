package lepton.control

interface ManagedOp {
    fun use(resource: AutoCloseable): AutoCloseable
    fun <T> use(resource: T, closer: (T) -> Unit): T
}

private class ManagedOpImpl : ManagedOp {
    override fun use(resource: AutoCloseable): AutoCloseable {
        return resource
    }

    override fun <T> use(resource: T, closer: (T) -> Unit): T {
        return resource
    }
}