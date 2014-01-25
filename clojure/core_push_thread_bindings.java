package clojure;

import clojure.lang.*;

public final class core_push_thread_bindings extends clojure.lang.AFunction {
 static {
 }
 public core_push_thread_bindings() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object bindings1) {
  clojure.lang.Var.pushThreadBindings((clojure.lang.Associative)((clojure.lang.Associative)bindings1));
  return null;
 }
}
