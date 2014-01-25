package clojure;

import clojure.lang.*;

public final class core_eval extends clojure.lang.AFunction {
 static {
 }
 public core_eval() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object form1) {
  return ((java.lang.Object)clojure.lang.Compiler.eval(((java.lang.Object)form1)));
 }
}
