package com.fitnessapp2020.beachamp.model

object Athlete : Person() {

    private lateinit var sport: Sport
    
    init {
        var name: String
        var age: Int
    }

    fun setSport(sport: Sport) {
        this.sport = sport
    }

    fun getSport(): String {
        return sport.sport
    }

    fun addFriend(friend: Friend) {
        friends.add(Friend())
        notifyChange()
    }

    fun removeFriend(friend: Friend) {
        friends.remove(friend)
        notifyChange()
    }

    fun checkFriendDuplicate(friend: Friend): Boolean {
        for (x: Friend in friends) {
            if (x == friend) {
                return true
            }
        }
        return false
    }

    fun addSportGoal(sportGoal: SportGoal) {
        if (sportGoals.size < 5) {
            sportGoals.add(sportGoal)
        }
        notifyChange()
    }

    fun removeSportGoal(sportGoal: SportGoal) {
        sportGoals.remove(sportGoal)
    }

    operator fun invoke(): Athlete {
        return this
    }
}