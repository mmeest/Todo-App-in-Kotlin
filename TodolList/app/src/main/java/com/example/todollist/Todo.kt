package com.example.todollist

data class Todo(
    val title: String,
    var isChecked: Boolean = false
)