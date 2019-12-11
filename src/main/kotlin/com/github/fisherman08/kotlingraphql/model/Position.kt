package com.github.fisherman08.kotlingraphql.model

enum class Position (val id: String, val positionName: String) {
    STARTING_PITCHER(id = "1", positionName = "Starting Pitcher"),
    RELIEF_PITCHER(id = "2", positionName = "Relief Pitcher"),
    CATCHER(id = "3", positionName = "Catcher"),
    FIRST_BASE_MAN(id = "4", positionName = "First Base Man"),
    SECOND_BASE_MAN(id = "5", positionName = "Second Base Man"),
    THIRD_BASE_MAN(id = "6", positionName = "Third Base Man"),
    SHORT_STOP(id = "7", positionName = "Short Stop"),
    LEFT_FIELDER(id = "8", positionName = "Left Fielder"),
    CENTER_FIELDER(id = "9", positionName = "Center Fielder"),
    RIGHT_FIELDER(id = "10", positionName = "Right Fielder"),
    DESIGNATED_HITTER(id = "11", positionName = "Designated Hitter");
}
