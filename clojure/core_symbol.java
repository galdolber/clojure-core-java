package clojure;

import clojure.lang.*;

public final class core_symbol extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
 }
 public core_symbol() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ns1, java.lang.Object name2) {
  return ((clojure.lang.Symbol)clojure.lang.Symbol.intern((java.lang.String)((java.lang.String)ns1), (java.lang.String)((java.lang.String)name2)));
 }
 public java.lang.Object invoke(java.lang.Object name1) {
  Object __r2301 = ((IFn)const__0.getRawRoot()).invoke(name1);
  if (__r2301 != null && !(__r2301 == Boolean.FALSE)) {
   return name1;
  } else {
   return ((clojure.lang.Symbol)clojure.lang.Symbol.intern((java.lang.String)((java.lang.String)name1)));
  }
 }
}
