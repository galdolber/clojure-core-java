package clojure;

import clojure.lang.*;

public final class pprint_check_enumerated_arg extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public pprint_check_enumerated_arg() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object arg1, java.lang.Object choices2) {
  Object __r5039 = ((IFn)const__0.getRawRoot()).invoke(((IFn)choices2).invoke(arg1));
  if (__r5039 != null && !(__r5039 == Boolean.FALSE)) {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke("Bad argument: ", arg1, ". It must be one of ", choices2))));
   return null;
  } else {
   return null;
  }
 }
}
