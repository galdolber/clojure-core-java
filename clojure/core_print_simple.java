package clojure;

import clojure.lang.*;

public final class core_print_simple extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public core_print_simple() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object o1, java.lang.Object w2) {
  try {
   ((IFn)const__0.getRawRoot()).invoke(o1, w2);
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(o1)));
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
