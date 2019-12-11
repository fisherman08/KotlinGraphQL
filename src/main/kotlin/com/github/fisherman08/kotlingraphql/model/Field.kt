package com.github.fisherman08.kotlingraphql.model

enum class Field(val id: String, val fieldName: String) {
    YANKEE_STADIUM(id = "1", fieldName = "Yankee Stadium"),
    WRIGLEY_FIELD(id = "2", fieldName = "Wrigley Field" ),
    T_MOBILE_PARK(id = "3", fieldName = "T-Mobile Park"),
    ANGEL_STADIUM(id = "4", fieldName = "Angel Stadium of Anaheim");
}
