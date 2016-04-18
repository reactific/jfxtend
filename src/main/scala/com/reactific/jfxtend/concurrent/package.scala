package com.reactific.jfxtend

import javafx.concurrent.Task

/** Unit Tests For package */
package object concurrent {

  implicit class TaskXtend[T](val extendee : Task[T]) extends TaskExtensions[T]
}
