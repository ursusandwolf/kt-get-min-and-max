package mate.academy

fun getMinAndMax(inputArray: IntArray)
    = inputArray.takeIf { it.isNotEmpty() }
    ?.let { intArrayOf(it.min(), it.max()) }
    ?: intArrayOf()