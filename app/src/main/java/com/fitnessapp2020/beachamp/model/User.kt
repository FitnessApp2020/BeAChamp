package com.fitnessapp2020.beachamp.model

import android.provider.ContactsContract
import com.fitnessapp2020.beachamp.observerPattern.Subject

object User : Person() {
    
    init {
        var name: String
        var age: Int
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
    }

    fun removeSportGoal(sportGoal: SportGoal) {
        sportGoals.remove(sportGoal)
    }

    operator fun invoke(): User {
        return this
    }
}