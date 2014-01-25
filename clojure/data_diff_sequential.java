package clojure;

import clojure.lang.*;

public final class data_diff_sequential extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__2 = (clojure.lang.Var)RT.var("clojure.data", "vectorize");
  const__3 = (clojure.lang.Var)RT.var("clojure.data", "diff-associative");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "range");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "max");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "count");
 }
 public data_diff_sequential() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2) {
  Object __r6383;
  Object __r6384 = ((IFn)const__4.getRawRoot()).invoke(a1);
  if (__r6384 != null && !(__r6384 == Boolean.FALSE)) {
   __r6383 = a1;
  } else {
   __r6383 = ((IFn)const__0.getRawRoot()).invoke(a1);
  }
  Object __r6385;
  Object __r6386 = ((IFn)const__4.getRawRoot()).invoke(b2);
  if (__r6386 != null && !(__r6386 == Boolean.FALSE)) {
   __r6385 = b2;
  } else {
   __r6385 = ((IFn)const__0.getRawRoot()).invoke(b2);
  }
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), ((IFn)const__3.getRawRoot()).invoke(__r6383, __r6385, ((IFn)const__5.getRawRoot()).invoke(Numbers.num(clojure.lang.Numbers.max((long)clojure.lang.RT.count(((java.lang.Object)a1)), (long)clojure.lang.RT.count(((java.lang.Object)b2))))))));
 }
}
