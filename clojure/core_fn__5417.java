package clojure;

import clojure.lang.*;

public final class core_fn__5417 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "print-sequential");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "print-dup");
 }
 public core_fn__5417() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object o1, java.lang.Object w2) {
  try {
   ((IFn)const__0.getRawRoot()).invoke(o1, w2);
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"#=("));
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.Class)((IFn)const__1.getRawRoot()).invoke(o1)).getName())));
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"/create "));
   ((IFn)const__2.getRawRoot()).invoke("[", const__3.getRawRoot(), " ", "]", o1, w2);
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)")"));
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
