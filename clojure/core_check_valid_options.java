package clojure;

import clojure.lang.*;

public final class core_check_valid_options extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "disj");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "hash-set");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "keys");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 public core_check_valid_options() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object options1, java.lang.Object valid_keys2) {
  Object __r2399 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), ((IFn)const__1.getRawRoot()).invoke(const__3.getRawRoot(), ((IFn)const__4.getRawRoot()).invoke(options1)), valid_keys2));
  if (__r2399 != null && !(__r2399 == Boolean.FALSE)) {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(const__5.getRawRoot(), "Only these options are valid: ", ((IFn)const__6.getRawRoot()).invoke(valid_keys2), ((IFn)const__7.getRawRoot()).invoke(new clojure.core_check_valid_options_fn__4102(), ((IFn)const__8.getRawRoot()).invoke(valid_keys2))))));
   return null;
  } else {
   return null;
  }
 }
 public int getRequiredArity() {
  return 1;
 }
}
