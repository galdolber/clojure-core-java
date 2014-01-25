package clojure;

import clojure.lang.*;

public final class core_newline extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "system-newline");
 }
 public core_newline() {
  super();
 }
 public java.lang.Object invoke() {
  try {
   ((java.io.Writer)const__0.get()).append((java.lang.CharSequence)((java.lang.CharSequence)const__1.getRawRoot()));
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
