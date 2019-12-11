package com.github.fisherman08.kotlingraphql.presentation.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.github.fisherman08.kotlingraphql.model.Player
import com.github.fisherman08.kotlingraphql.model.Yankees
import org.springframework.stereotype.Component

@Component
class QueryResolver : GraphQLQueryResolver {
    fun player(id: String): Player = Player(id = "abc", name = "田中将大")
}
