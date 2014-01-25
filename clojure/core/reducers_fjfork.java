package clojure.core;

import clojure.lang.*;

public final class reducers_fjfork extends clojure.lang.AFunction {
 static {
 }
 public reducers_fjfork() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object task1) {
  return ((java.util.concurrent.ForkJoinTask)((java.util.concurrent.ForkJoinTask)task1).fork());
 }
}
