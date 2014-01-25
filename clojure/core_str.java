package clojure;

import clojure.lang.*;

public final class core_str extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public core_str() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object ys2) {
  return ((IFn)new clojure.core_str_fn__3921()).invoke(new java.lang.StringBuilder((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(x1))), ys2);
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  if (clojure.lang.Util.identical(((java.lang.Object)x1), ((java.lang.Object)null))) {
   return "";
  } else {
   return ((java.lang.String)((java.lang.Object)x1).toString());
  }
 }
 public java.lang.Object invoke() {
  return "";
 }
 public int getRequiredArity() {
  return 1;
 }
}
