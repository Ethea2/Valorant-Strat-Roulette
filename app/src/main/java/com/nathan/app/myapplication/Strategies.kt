package com.nathan.app.myapplication

class Strategies {


    fun anyMapStrats(): MutableMap<String, String> {
        val anyMapStrat = mutableMapOf(
            "Backstabbing Ninjas" to """Everyone in the team are not allowed to use their guns.
                |Everyone must hide and get a knife kill.
            """.trimMargin(),

            "Spinbotters" to """Everyone must put their sensitivity to the max. 
                |When you see an enemy you must try to do a 360 trickshot on them with the max
                | sensitivity""".trimMargin(),

            "The Turtle Strat" to """Everyone must set their sensitivity to the minimum. No one is 
                |allowed to stand up, everyone should crouch walk for the whole round.""".trimMargin(),

            "Bad Calls" to """Everyone in the team must intentionally make bad calls and fake calls 
                |everytime they see an enemy. Try winning the round with this strat!""".trimMargin(),

            "Odin/Ares Gods" to """You are only allowed to use Odin for the whole round, if you 
                |don't have enough money, buy ares as a substitute. 
                |The goal is to piss the enemy off!""".trimMargin(),

            "Sniper Squad" to """You are only allowed to use a sniper for this round, either a 
                |Marshall or an Operator. Oh and also, you can't use your scope!""".trimMargin(),

            "I Can Kill You With My Eyes Closed" to """No one is allowed to open their eyes for this
                | round. You can only play with the sounds! Make sure to use your chakra properly 
                | to find the enemies and win the round""".trimMargin(),

            "A True Lefty" to """Everyone must make their in-game character left handed. Everyone 
                |must also use their left hand for the mouse and right hand for the keyboard.""".trimMargin(),

            "Voluntary KAY/O Ult" to """No one is allowed to use any abilities.""",

            "Voluntary Kill Joy Ult" to """No one is allowed to shoot their guns, 
                |but are allowed to use their abilities and knife.""".trimMargin(),

            "Gun Game" to """Once you kill an enemy, you must pick their gun and use it."""
            )
        return anyMapStrat
    }


    fun anyMapDefendingStrats(): MutableMap<String, String> {
        val anyMapDefStrat = mutableMapOf(
            "The Final Defense" to """Everyone must pick a site and defend it together as 5, with
                |pistols only.""".trimMargin(),

            "Dynamic Defense" to """Everyone must stick together and defend one site for 10 seconds,
                |after camping that site for 10 seconds transfer to another site as a team.""".trimMargin(),

            "It Only Takes 1" to """Only one person can defend a site, everyone that doesn't have a 
                |site to defend must hide in spawn. Once a defender dies on a site,
                |one of the reserves should cover that site.
            """.trimMargin(),

            "The Best Defense is Offense" to """Hit the enemy with derogatory, discriminatory,
                |and racial slurs. Just kidding. Everyone must push every angle in the map without
                |hesitation. RUSH!! """.trimMargin()
        )
        return anyMapDefStrat
    }

    fun anyMapAttackingStrats(): MutableMap<String, String> {
        val anyMapAttackStrat = mutableMapOf(
            "Meatshields" to """Only the bomb holder can shoot. While everyone tries to cover
                |the bomb holder with their bodies acting as a meatshield. 
                |Whoever picks the bomb will become the new person to 
                |protect and the only one allowed to shoot.""".trimMargin(),

            "Spawn Fort" to """Everyone must stay in spawn and defend it as best they can. 
                |If the enemy doesn't push you in spawn, taunt them so that 
                |they will push you next round!""".trimMargin(),

            "Bunny Push" to """Everyone must rush a site bunny hopping. No one is allowed to stop
                | bunny hopping.""".trimMargin(),

            "Rush B" to """No stopping. Just rush B. Don't bait your teammates!""",

            "Smoke Path" to """Create a path of smokes going to a site of your choice. Everyone must
                | walk push that site while staying inside the smoke. 
                | Then everyone jumps out all at the same time.""".trimMargin(),

            "Tactical Leader" to """Everyone must elect a leader to follow. Everything that the 
                |leader says must be followed without hesitation. 
                |The tactical leader can only stay in the base""".trimMargin()
        )

        return anyMapAttackStrat
    }

}