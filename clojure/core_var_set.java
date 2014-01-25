package clojure;

import clojure.lang.*;

public final class core_var_set extends clojure.lang.AFunction {
 static {
 }
 public core_var_set() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object val2) {
  return ((java.lang.Object)((clojure.lang.Var)x1).set(((java.lang.Object)val2)));
 }
}
