package clojure.core;

import clojure.lang.*;

public final class reducers_fjtask extends clojure.lang.AFunction {
 static {
 }
 public reducers_fjtask() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  return ((java.util.concurrent.ForkJoinTask)java.util.concurrent.ForkJoinTask.adapt((java.util.concurrent.Callable)((java.util.concurrent.Callable)f1)));
 }
}
