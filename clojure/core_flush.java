package clojure;

import clojure.lang.*;

public final class core_flush extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
 }
 public core_flush() {
  super();
 }
 public java.lang.Object invoke() {
  try {
   ((java.io.Writer)const__0.get()).flush();
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
