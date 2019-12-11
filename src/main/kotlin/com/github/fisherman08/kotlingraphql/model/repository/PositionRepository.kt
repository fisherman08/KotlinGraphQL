package com.github.fisherman08.kotlingraphql.model.repository

import com.github.fisherman08.kotlingraphql.model.Player
import com.github.fisherman08.kotlingraphql.model.Position
import org.springframework.stereotype.Repository

@Repository
class PositionRepository {
    private val dict = mapOf<String, List<Position>>(
        "1" to listOf(Position.STARTING_PITCHER),
        "2" to listOf(Position.STARTING_PITCHER),
        "3" to listOf(Position.RIGHT_FIELDER, Position.CENTER_FIELDER, Position.LEFT_FIELDER),
        "4" to listOf(Position.STARTING_PITCHER, Position.DESIGNATED_HITTER, Position.RIGHT_FIELDER)
    )

    fun getPositionByPlayer(player: Player): List<Position> {
        return dict[player.id] ?: emptyList()
    }
}

