package com.github.fisherman08.kotlingraphql.presentation.resolver

import com.coxautodev.graphql.tools.GraphQLResolver
import com.github.fisherman08.kotlingraphql.model.Player
import com.github.fisherman08.kotlingraphql.model.Position
import com.github.fisherman08.kotlingraphql.model.Team
import com.github.fisherman08.kotlingraphql.model.repository.PositionRepository
import com.github.fisherman08.kotlingraphql.model.repository.TeamRepository
import org.springframework.stereotype.Component

@Component
class PlayerResolver(
        val teamRepository: TeamRepository,
        val positionRepository: PositionRepository
) : GraphQLResolver<Player> {

    fun getTeam(player: Player): Team? {
        return teamRepository.getTeamByPlayer(player = player)
    }

    fun getPositions(player: Player): List<Position> {
        return positionRepository.getPositionByPlayer(player = player)
    }
}
