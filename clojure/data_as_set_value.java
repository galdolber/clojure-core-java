package clojure;

import clojure.lang.*;

public final class data_as_set_value extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "set?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "into");
 }
 public data_as_set_value() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  Object __r6398 = ((IFn)const__0.getRawRoot()).invoke(s1);
  if (__r6398 != null && !(__r6398 == Boolean.FALSE)) {
   return s1;
  } else {
   return ((IFn)const__1.getRawRoot()).invoke(clojure.lang.PersistentHashSet.EMPTY, s1);
  }
 }
}
