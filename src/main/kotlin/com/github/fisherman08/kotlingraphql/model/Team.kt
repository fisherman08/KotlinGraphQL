package com.github.fisherman08.kotlingraphql.model

enum class Team(val id: String, val teamName: String, val field: Field) {
    YANKEES(id = "1", teamName = "NewYork Yankees", field = Field.YANKEE_STADIUM),
    CUBS(id = "2", teamName = "Chicago Cubs", field = Field.WRIGLEY_FIELD),
    MARINERS(id = "3", teamName = "Seattle Mariners", field = Field.T_MOBILE_PARK),
    ANGELS(id = "4", teamName = "LosAngels Angels of Anaheim", field = Field.ANGEL_STADIUM);
}
