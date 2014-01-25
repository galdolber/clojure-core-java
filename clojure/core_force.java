package clojure;

import clojure.lang.*;

public final class core_force extends clojure.lang.AFunction {
 static {
 }
 public core_force() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((java.lang.Object)clojure.lang.Delay.force(((java.lang.Object)x1)));
 }
}
