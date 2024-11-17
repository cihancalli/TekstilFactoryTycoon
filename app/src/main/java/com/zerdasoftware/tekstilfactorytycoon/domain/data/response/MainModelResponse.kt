package com.zerdasoftware.tekstilfactorytycoon.domain.data.response

data class MainModelResponse(

    val data: List<MainDataItem>? = null,
    val errors: List<String>? = null
)

data class MainDataItem(
    val id: Int? = null,
    val mainName: String? = null,
)
