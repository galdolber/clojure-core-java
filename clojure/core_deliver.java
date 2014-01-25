package clojure;

import clojure.lang.*;

public final class core_deliver extends clojure.lang.AFunction {
 static {
 }
 public core_deliver() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object promise1, java.lang.Object val2) {
  return ((IFn)promise1).invoke(val2);
 }
}
