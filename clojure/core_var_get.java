package clojure;

import clojure.lang.*;

public final class core_var_get extends clojure.lang.AFunction {
 static {
 }
 public core_var_get() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((java.lang.Object)((clojure.lang.Var)x1).get());
 }
}
