package com.fitnessapp2020.beachamp.model

import com.fitnessapp2020.beachamp.observerPattern.Subject

open class Person : Subject() {
    lateinit var sportDecision: String
    lateinit var email: String
    var friends = mutableListOf<Friend>()
    var sportGoals = mutableListOf<SportGoal>()

}