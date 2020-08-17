package com.fitnessapp2020.beachamp.model

class Soccer : ISport {

    override fun hasBallControlExercises(): Boolean {
        return true
    }

    override fun hasBallTakeDownExercises(): Boolean {
        return true
    }

    override fun hasShootingExercises(): Boolean {
        return true
    }
}

class HandBall : ISport {

    override fun hasBallControlExercises(): Boolean {
        return true
    }

    override fun hasThrowingExercises(): Boolean {
        return true
    }
}

class Boxing : ISport {}

class Bodybuilding : ISport {}

class Exerciser : ISport {}
