package ru.netology.coroutines.dto

import ru.netology.coroutines.enum.AttachmentType

data class Attachment(
    val url: String,
    val description: String,
    val type: AttachmentType
)

