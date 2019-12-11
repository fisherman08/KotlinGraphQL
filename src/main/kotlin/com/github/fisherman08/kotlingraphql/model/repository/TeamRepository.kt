package com.github.fisherman08.kotlingraphql.model.repository

import com.github.fisherman08.kotlingraphql.model.Player
import com.github.fisherman08.kotlingraphql.model.Team
import org.springframework.stereotype.Repository

@Repository
class TeamRepository {

    private val dict = mapOf<String, Team>(
            "1" to Team.YANKEES,
            "2" to Team.CUBS,
            "4" to Team.ANGELS
    )

    fun getTeamByPlayer(player: Player): Team? {
        return dict[player.id]
    }
}
