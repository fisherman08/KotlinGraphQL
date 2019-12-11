package com.github.fisherman08.kotlingraphql.presentation.resolver

import com.coxautodev.graphql.tools.GraphQLResolver
import com.github.fisherman08.kotlingraphql.model.Player
import com.github.fisherman08.kotlingraphql.model.Team
import com.github.fisherman08.kotlingraphql.model.Yankees
import org.springframework.stereotype.Component

@Component
class PlayerResolver : GraphQLResolver<Player> {

    fun getTeam(player: Player): Team? {
        return Yankees()
    }
}
