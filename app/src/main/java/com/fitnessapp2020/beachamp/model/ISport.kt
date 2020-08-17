package com.fitnessapp2020.beachamp.model

interface ISport {

    fun hasLoseFat(): Boolean {
        return true
    }

    fun hasGainMuscle(): Boolean {
        return true
    }

    fun hasGainStrength(): Boolean {
        return true
    }

    fun hasGainSpeed(): Boolean {
        return true
    }

    fun hasAgilityTraining(): Boolean {
        return true
    }

    fun hasBalanceTraining(): Boolean {
        return true
    }

    fun hasGainEndurance(): Boolean {
        return true
    }

    fun hasJumpingExercises(): Boolean {
        return true
    }

    fun hasBallControlExercises(): Boolean {
        return false
    }

    fun hasBallTakeDownExercises(): Boolean {
        return false
    }

    fun hasShootingExercises(): Boolean {
        return false
    }

    fun hasThrowingExercises(): Boolean {
        return false
    }

    fun hasOwnChoice(): Boolean {
        return true
    }
}