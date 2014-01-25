package clojure.java;

import clojure.lang.*;

public final class io_file extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "as-file");
  const__1 = (clojure.lang.Var)RT.var("clojure.java.io", "as-relative-path");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
  const__3 = (clojure.lang.Var)RT.var("clojure.java.io", "file");
 }
 public io_file() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object parent1, java.lang.Object child2, java.lang.Object more3) {
  return ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), ((IFn)const__3.getRawRoot()).invoke(parent1, child2), more3);
 }
 public java.lang.Object invoke(java.lang.Object parent1, java.lang.Object child2) {
  Object __r6306 = parent1;
  if (!(__r6306 instanceof clojure.java.io.Coercions)) {
   __r6306 = ((IFn)const__0.getRawRoot()).invoke(__r6306);
  } else {
   __r6306 = ((java.lang.Object)((clojure.java.io.Coercions) __r6306).as_file());
  }
  return new java.io.File((java.io.File)((java.io.File)__r6306), (java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(child2)));
 }
 public java.lang.Object invoke(java.lang.Object arg1) {
  Object __r6307 = arg1;
  if (!(__r6307 instanceof clojure.java.io.Coercions)) {
   return ((IFn)const__0.getRawRoot()).invoke(__r6307);
  } else {
   return ((clojure.java.io.Coercions) __r6307).as_file();
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
