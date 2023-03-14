package com.example.domain.model

data class Repository(
    val id: Int,
    val name: String,
    val full_name: String,
    val html_url: String,
    val description: String? = null,
    val open_issues_count: Int,
)
