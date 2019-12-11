package com.github.fisherman08.kotlingraphql.presentation.resolver

import com.coxautodev.graphql.tools.GraphQLResolver
import com.github.fisherman08.kotlingraphql.model.Team
import org.springframework.stereotype.Component

@Component
class TeamResolver : GraphQLResolver<Team> {

}
