package com.example.contentprovidercontacts

data class Contact(
    val id: Int,
    val name: String,
    val numbers: MutableSet<String>
)