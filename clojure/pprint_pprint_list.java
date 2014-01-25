package clojure;

import clojure.lang.*;

public final class pprint_pprint_list extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-reader-macro");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-simple-list");
 }
 public pprint_pprint_list() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object alis1) {
  Object __r5911 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(alis1));
  if (__r5911 != null && !(__r5911 == Boolean.FALSE)) {
   return ((IFn)const__2.getRawRoot()).invoke(alis1);
  } else {
   return null;
  }
 }
}
