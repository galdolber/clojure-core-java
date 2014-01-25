package clojure.core;

import clojure.lang.*;

public final class reducers_cat extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "+");
 }
 public reducers_cat() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object left1, java.lang.Object right2) {
  if (clojure.lang.Numbers.isZero((long)clojure.lang.RT.count(((java.lang.Object)left1)))) {
   return right2;
  } else {
   if (clojure.lang.Numbers.isZero((long)clojure.lang.RT.count(((java.lang.Object)right2)))) {
    return left1;
   } else {
    Object __r4416 = const__2;
    if (__r4416 != null && !(__r4416 == Boolean.FALSE)) {
     return new clojure.core.reducers.Cat(((java.lang.Object)Numbers.num(clojure.lang.Numbers.add((long)clojure.lang.RT.count(((java.lang.Object)left1)), (long)clojure.lang.RT.count(((java.lang.Object)right2))))), ((java.lang.Object)left1), ((java.lang.Object)right2));
    } else {
     return null;
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object ctor1) {
  return new clojure.core.reducers_cat_fn__6740(ctor1);
 }
 public java.lang.Object invoke() {
  return new java.util.ArrayList();
 }
}
