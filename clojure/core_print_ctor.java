package clojure;

import clojure.lang.*;

public final class core_print_ctor extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "class");
 }
 public core_print_ctor() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object o1, java.lang.Object print_args2, java.lang.Object w3) {
  try {
   ((java.io.Writer)w3).write((java.lang.String)((java.lang.String)"#=("));
   ((java.io.Writer)w3).write((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.Class)((IFn)const__0.getRawRoot()).invoke(o1)).getName())));
   ((java.io.Writer)w3).write((java.lang.String)((java.lang.String)". "));
   ((IFn)print_args2).invoke(o1, w3);
   ((java.io.Writer)w3).write((java.lang.String)((java.lang.String)")"));
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
