package com.example.swipequiz

data class Question(
    var question: String,
    var answer: Boolean
) {
    companion object {
        val QUESTIONS = arrayOf(
            "Deze vraag is juist",
            "Deze vraag is onjuist",
            "Deze vraag is onjuist",
            "Deze vraag is juist"
        )

        val ANSWERS = arrayOf(
            true,
            false,
            false,
            true
        )
    }
}