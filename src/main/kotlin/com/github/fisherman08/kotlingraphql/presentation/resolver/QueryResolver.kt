package com.github.fisherman08.kotlingraphql.presentation.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.github.fisherman08.kotlingraphql.model.Player
import com.github.fisherman08.kotlingraphql.model.repository.PlayerRepository
import org.springframework.stereotype.Component

@Component
class QueryResolver(
        val playerRepository: PlayerRepository
) : GraphQLQueryResolver {

    fun getPlayerByID(id: String): Player? = playerRepository.getPlayerByID(id = id)

    fun getAllPlayers(): List<Player> = playerRepository.getAllPlayers()
}
