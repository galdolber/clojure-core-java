package clojure;

import clojure.lang.*;

public final class core_fn__5494 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-dup");
 }
 public core_fn__5494() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object w2) {
  try {
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"#=(find-ns "));
   ((IFn)const__0.getRawRoot()).invoke(((clojure.lang.Symbol)((clojure.lang.Namespace)n1).name), w2);
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)")"));
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
