package clojure;

import clojure.lang.*;

public final class core_str_fn__3921 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_str_fn__3921() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object sb1, java.lang.Object more2) {
  while(true) {
   Object __r2298 = more2;
   if (__r2298 != null && !(__r2298 == Boolean.FALSE)) {
    java.lang.Object sb1___aux = ((java.lang.StringBuilder)((java.lang.StringBuilder)sb1).append((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(more2)))));
    java.lang.Object more2___aux = ((IFn)const__2.getRawRoot()).invoke(more2);
    sb1 = sb1___aux;
    more2 = more2___aux;
    continue;
   } else {
    return ((IFn)const__0.getRawRoot()).invoke(sb1);
   }
  }
 }
}
