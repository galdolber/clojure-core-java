package clojure;

import clojure.lang.*;

public final class core_print_object extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.IMeta.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "print-meta");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public core_print_object() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object o1, java.lang.Object w2) {
  try {
   if ((o1 instanceof clojure.lang.IMeta)) {
    ((IFn)const__2.getRawRoot()).invoke(o1, w2);
   } else {
   }
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"#<"));
   {
    Object name3 = ((java.lang.String)((java.lang.Class)((IFn)const__3.getRawRoot()).invoke(o1)).getSimpleName());
    Object __r3446 = ((IFn)const__4.getRawRoot()).invoke(name3);
    if (__r3446 != null && !(__r3446 == Boolean.FALSE)) {
     ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)name3));
     ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)" "));
    } else {
    }
   }
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)((IFn)const__5.getRawRoot()).invoke(o1)));
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)">"));
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
