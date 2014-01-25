package clojure;

import clojure.lang.*;

public final class test_file_position extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
 }
 public test_file_position() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  {
   Object s2 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)((java.lang.StackTraceElement[])((java.lang.Throwable)new java.lang.Throwable()).getStackTrace())), (int)RT.intCast(n1)));
   return RT.vector(((java.lang.String)((java.lang.StackTraceElement)s2).getFileName()), Integer.valueOf(((java.lang.StackTraceElement)s2).getLineNumber()));
  }
 }
}
