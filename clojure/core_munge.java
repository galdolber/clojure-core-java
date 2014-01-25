package clojure;

import clojure.lang.*;

public final class core_munge extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public core_munge() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  Object __r3712;
  Object __r3713 = ((IFn)const__0.getRawRoot()).invoke(s1);
  if (__r3713 != null && !(__r3713 == Boolean.FALSE)) {
   __r3712 = const__1.getRawRoot();
  } else {
   __r3712 = const__2.getRawRoot();
  }
  return ((IFn)__r3712).invoke(((java.lang.String)clojure.lang.Compiler.munge((java.lang.String)((java.lang.String)((IFn)const__2.getRawRoot()).invoke(s1)))));
 }
}
