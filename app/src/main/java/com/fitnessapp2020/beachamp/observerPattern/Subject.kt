package com.fitnessapp2020.beachamp.observerPattern

abstract class Subject {

    //The observers are stored in this Set
    var observers = mutableSetOf<Observer>()

    final fun attach(observer: Observer) {
        observers.add(observer)
    }

    final fun detach(observer: Observer) {
        observers.remove(observer)
    }

    final fun notifyChange() {
        for (Observer in observers) {
            Observer.update(this)
        }
    }
}