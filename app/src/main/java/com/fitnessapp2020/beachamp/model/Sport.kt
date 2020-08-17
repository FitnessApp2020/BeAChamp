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

    override fun toString(): String {
        return "Soccer"
    }
}

class HandBall : ISport {

    override fun hasBallControlExercises(): Boolean {
        return true
    }

    override fun hasThrowingExercises(): Boolean {
        return true
    }

    override fun toString(): String {
        return "Handball"
    }
}

class Boxing : ISport {
    override fun toString(): String {
        return "Boxing"
    }
}

class Bodybuilding : ISport {
    override fun toString(): String {
        return "Bodybuilding"
    }
}

class Exerciser : ISport {
    override fun toString(): String {
        return "Exerciser"
    }
}
