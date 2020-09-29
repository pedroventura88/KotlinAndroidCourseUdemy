package operationsAndPriorities

fun main() {
    val isMarried = true;
    val GPA = 3.9
    val isQualified = if (isMarried && GPA >= 3.9) 1 else 0

    print(isQualified)

    val isGood = when(GPA){
        4.0 -> true
        else -> false
    }

    print(isGood)
}