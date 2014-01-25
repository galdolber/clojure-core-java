package clojure;

import clojure.lang.*;

public final class core_fn__5448 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "print-map");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "pr-on");
 }
 public core_fn__5448() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object r1, java.lang.Object w2) {
  try {
   ((IFn)const__0.getRawRoot()).invoke(r1, w2);
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"#"));
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.Class)((IFn)const__1.getRawRoot()).invoke(r1)).getName())));
   return ((IFn)const__2.getRawRoot()).invoke(r1, const__3.getRawRoot(), w2);
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
