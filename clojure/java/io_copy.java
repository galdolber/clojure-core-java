package clojure.java;

import clojure.lang.*;

public final class io_copy extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "do-copy");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
 }
 public io_copy() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object input1, java.lang.Object output2, java.lang.Object opts3) {
  Object __r6302;
  Object __r6303 = opts3;
  if (__r6303 != null && !(__r6303 == Boolean.FALSE)) {
   __r6302 = ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), opts3);
  } else {
   __r6302 = null;
  }
  return ((IFn)const__0.getRawRoot()).invoke(input1, output2, __r6302);
 }
 public int getRequiredArity() {
  return 2;
 }
}
