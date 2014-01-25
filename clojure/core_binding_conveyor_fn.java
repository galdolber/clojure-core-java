package clojure;

import clojure.lang.*;

public final class core_binding_conveyor_fn extends clojure.lang.AFunction {
 static {
 }
 public core_binding_conveyor_fn() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  {
   Object frame2 = ((java.lang.Object)clojure.lang.Var.cloneThreadBindingFrame());
   return new clojure.core_binding_conveyor_fn_fn__4132(f1, frame2);
  }
 }
}
