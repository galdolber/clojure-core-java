package clojure;

import clojure.lang.*;

public final class pprint_level_exceeded extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*print-level*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-level*");
 }
 public pprint_level_exceeded() {
  super();
 }
 public java.lang.Object invoke() {
  {
   Object and__3966__auto__1 = const__0.get();
   Object __r5041 = and__3966__auto__1;
   if (__r5041 != null && !(__r5041 == Boolean.FALSE)) {
    return (clojure.lang.Numbers.gte(((java.lang.Object)const__2.get()), ((java.lang.Object)const__0.get())) ? Boolean.TRUE : Boolean.FALSE);
   } else {
    return and__3966__auto__1;
   }
  }
 }
}
