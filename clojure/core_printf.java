package clojure;

import clojure.lang.*;

public final class core_printf extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "format");
 }
 public core_printf() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object fmt1, java.lang.Object args2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), fmt1, args2));
 }
 public int getRequiredArity() {
  return 1;
 }
}
