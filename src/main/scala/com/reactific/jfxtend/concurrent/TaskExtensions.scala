package com.reactific.jfxtend.concurrent

import javafx.beans.value.{ChangeListener, ObservableValue}
import javafx.concurrent.{Worker, Task}

/** Extensions to JavaFX Task  */
trait TaskExtensions[T] extends WorkerExtensions[T,Task[T]] {

  type StateObservable = ObservableValue[_ <: Worker.State]

  def onChanged(f : (StateObservable, Worker.State, Worker.State) ⇒ Unit ) : Unit = {
    extendee.stateProperty().addListener(
      new ChangeListener[Worker.State] {
        def changed(observable : StateObservable, oldState : Worker.State, newState: Worker.State) : Unit = {
          f(observable, oldState, newState)
        }
      }
    )
  }

  def onSucceeded(f : (StateObservable) ⇒ Unit ) : Unit = {
    onChanged { (obs,oldS,newS) ⇒
      if (newS == Worker.State.SUCCEEDED && oldS != Worker.State.SUCCEEDED) {
        f(obs)
      }
    }
  }

  def onReady(f : (StateObservable) ⇒ Unit ) : Unit = {
    onChanged { (obs,oldS,newS) ⇒
      if (newS == Worker.State.READY && oldS != Worker.State.READY) {
        f(obs)
      }
    }
  }
  def onScheduled(f : (StateObservable) ⇒ Unit ) : Unit = {
    onChanged { (obs,oldS,newS) ⇒
      if (newS == Worker.State.SCHEDULED && oldS != Worker.State.SCHEDULED) {
        f(obs)
      }
    }
  }
  def onRunning(f : (StateObservable) ⇒ Unit ) : Unit = {
    onChanged { (obs,oldS,newS) ⇒
      if (newS == Worker.State.RUNNING && oldS != Worker.State.RUNNING) {
        f(obs)
      }
    }
  }
  def onCancelled(f : (StateObservable) ⇒ Unit ) : Unit = {
    onChanged { (obs,oldS,newS) ⇒
      if (newS == Worker.State.CANCELLED && oldS != Worker.State.CANCELLED) {
        f(obs)
      }
    }
  }
  def onFailed(f : (StateObservable) ⇒ Unit ) : Unit = {
    onChanged { (obs,oldS,newS) ⇒
      if (newS == Worker.State.FAILED && oldS != Worker.State.FAILED) {
        f(obs)
      }
    }
  }


}
