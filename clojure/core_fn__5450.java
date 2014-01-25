package clojure;

import clojure.lang.*;

public final class core_fn__5450 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*verbose-defrecords*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "print-map");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "print-dup");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "print-sequential");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "pr-on");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "vals");
 }
 public core_fn__5450() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object r1, java.lang.Object w2) {
  try {
   ((IFn)const__0.getRawRoot()).invoke(r1, w2);
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"#"));
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.Class)((IFn)const__1.getRawRoot()).invoke(r1)).getName())));
   Object __r3464 = const__2.get();
   if (__r3464 != null && !(__r3464 == Boolean.FALSE)) {
    return ((IFn)const__3.getRawRoot()).invoke(r1, const__4.getRawRoot(), w2);
   } else {
    return ((IFn)const__5.getRawRoot()).invoke("[", const__6.getRawRoot(), ", ", "]", ((IFn)const__7.getRawRoot()).invoke(r1), w2);
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
