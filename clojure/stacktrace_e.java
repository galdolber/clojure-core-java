package clojure;

import clojure.lang.*;

public final class stacktrace_e extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.stacktrace", "print-stack-trace");
  const__1 = (clojure.lang.Var)RT.var("clojure.stacktrace", "root-cause");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*e");
  const__3 = (java.lang.Object)8L;
 }
 public stacktrace_e() {
  super();
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2.get()), const__3);
 }
}
