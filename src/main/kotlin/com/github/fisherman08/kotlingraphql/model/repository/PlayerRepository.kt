package com.github.fisherman08.kotlingraphql.model.repository

import com.github.fisherman08.kotlingraphql.model.Player
import org.springframework.stereotype.Repository

@Repository
class PlayerRepository {

    private val dict = mapOf<String, Player>(
            "1" to Player(id = "1", name = "田中将大"),
            "2" to Player(id = "2", name = "ダルビッシュ有"),
            "3" to Player(id = "3", name = "イチロー"),
            "4" to Player(id = "4", name = "大谷翔平")
    )

    fun getPlayerByID(id: String): Player? {
        return dict[id]
    }

}
