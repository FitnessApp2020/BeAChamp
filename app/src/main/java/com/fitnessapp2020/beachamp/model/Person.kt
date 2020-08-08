package com.fitnessapp2020.beachamp.model

open class Person : com.fitnessapp2020.beachamp.observerPattern.Subject() {
    lateinit var sportDecision: Sport
    lateinit var email: String
    var friends = mutableListOf<Friend>()
    var sportGoals = mutableListOf<SportGoal>()


}