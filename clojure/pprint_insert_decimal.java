package clojure;

import clojure.lang.*;

public final class pprint_insert_decimal extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__4 = (java.lang.Object)0L;
 }
 public pprint_insert_decimal() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object e2) {
  if (clojure.lang.Numbers.isNeg(((java.lang.Object)e2))) {
   return ((IFn)const__1.getRawRoot()).invoke(".", m1);
  } else {
   {
    Object loc3 = ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)e2)));
    return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(m1, const__4, loc3), ".", ((IFn)const__3.getRawRoot()).invoke(m1, loc3));
   }
  }
 }
}
