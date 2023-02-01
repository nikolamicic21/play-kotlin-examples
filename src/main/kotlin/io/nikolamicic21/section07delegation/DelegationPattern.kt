package io.nikolamicic21.section07delegation

fun delegationPattern() {
    val tom = TomAraya("Thrash Metal")
    tom.makeSound()
    val elvis = ElvisPresley("Dancin' to the Jailhouse Rock")
    elvis.makeSound()
}

private interface SoundBehavior {
    fun makeSound()
}

class ScreamBehavior(private val n: String) : SoundBehavior {
    override fun makeSound() =
        println("${n.uppercase()} !!!")
}

class RockAndRollBehavior(private val n: String) : SoundBehavior {
    override fun makeSound() =
        println("I'm the King of Rock 'N' Roll: $n")
}

class TomAraya(n: String) : SoundBehavior by ScreamBehavior(n)

class ElvisPresley(n: String) : SoundBehavior by RockAndRollBehavior(n)
