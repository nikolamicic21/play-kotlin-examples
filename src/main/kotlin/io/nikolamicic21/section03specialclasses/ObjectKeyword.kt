package io.nikolamicic21.section03specialclasses

fun objectKeyword() {
    rentPrice(10, 2, 1)

    println()

    DoAuth.takeParams("foo", "qwerty")

    println()

    BigBen.getBongs(12)
}

private fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) {
    val dayRates = object {
        val standard = 30 * standardDays
        val festivity = 50 * festivityDays
        val special = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special
    print("Total price: $$total")
}

private object DoAuth {
    fun takeParams(username: String, password: String) {
        print("input Auth params = $username:$password")
    }
}

private class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("BONG ")
            }
        }
    }
}


