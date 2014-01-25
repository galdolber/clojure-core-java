package clojure;

import clojure.lang.*;

public final class core_get_thread_bindings extends clojure.lang.AFunction {
 static {
 }
 public core_get_thread_bindings() {
  super();
 }
 public java.lang.Object invoke() {
  return ((clojure.lang.Associative)clojure.lang.Var.getThreadBindings());
 }
}
