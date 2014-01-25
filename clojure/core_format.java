package clojure;

import clojure.lang.*;

public final class core_format extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "to-array");
 }
 public core_format() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object fmt1, java.lang.Object args2) {
  return ((java.lang.String)java.lang.String.format((java.lang.String)((java.lang.String)fmt1), (java.lang.Object[])((java.lang.Object[])((IFn)const__0.getRawRoot()).invoke(args2))));
 }
 public int getRequiredArity() {
  return 1;
 }
}
