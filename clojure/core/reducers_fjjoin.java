package clojure.core;

import clojure.lang.*;

public final class reducers_fjjoin extends clojure.lang.AFunction {
 static {
 }
 public reducers_fjjoin() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object task1) {
  return ((java.lang.Object)((java.util.concurrent.ForkJoinTask)task1).join());
 }
}
