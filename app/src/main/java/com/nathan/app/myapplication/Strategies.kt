package com.nathan.app.myapplication

class Strategies {


    fun anyMapStrats(): MutableMap<String, String> {
        val anyMapStrat = mutableMapOf(
            "One mic" to """Whoever is at the bottom of the scoreboard for your team is the only person allowed to use their mic this round. They must attempt to make callouts 
for all of their teammates. They clearly aren't getting kills anyway, so don't worry if this hinders their playing.""",

            "Sound effects" to """You must make sound effects for every action that you do in game, such as shooting guns, using abilities, and of course: taking the teleporter.
Try to use the teleporter as much as possible this round, ideally making a different sound each time.""",

            "Retakes are fun" to """Your whole team must hide in spawn until the spike has been planted. 
You are then allowed to leave spawn and play normally.""",

            "Smoke Breaks" to """Your whole team must start the round in Hookah and hold it for as long as possible. 
You may only leave if the spike has been planted.""",

            "One at a time" to """Only one player can leave spawn at a time, the rest of the team must do their best to hide in spawn.""",

            "Gambling" to """Your whole team must go to one spikesite to defend. You've got a 1/3 chance to choose the right one, goodluck.""",

            "Just here in my garage" to """Your whole team must make it into garage and are not allowed to leave unless the spike is planted. For motivation, 
remember you are protecting your KNOWLEDGE and brand-new lamborghini.""",

            "Glass cannon" to """Each teammate must buy the most expensive weapon they can afford, but they are not allowed to have any armor.""",

            "Where are they coming from?" to """Everyone on your team must put their headset on backwards for the entire round.""",

            "No abilities" to """Players must not use their abilities for the entire round.""",

            "Abilities only" to """Players cannot shoot their guns for the entire round. ONLY ABILITIES ARE ALLOWED!""",

            "Knives out" to """You are only allowed to move if you are currently holding your knife. If you would like to shoot, 
you must stand stationary and cannot make any movement until you pull your knife back out.""",

            "Doppelgänger" to """If there is an enemy on the other team with the same agent as you, you must ignore all other enemies until you have killed your doppelgänger.
If you don't have a doppelgänger, try to let your teammates kill theirs before killing anyone.""",

            "Gunswap" to """Everytime you kill an enemy, you must pick up their gun and use it for your next kill. 
It doesn't matter what gun they had or how hard it will be to pick up, you cannot get a kill with the exact same gun more than once.""",

            "I think my W key is stuck" to """you must hold the W key for the entire round and you are not allowed to walk or stop"""

            )

        return anyMapStrat
    }

}