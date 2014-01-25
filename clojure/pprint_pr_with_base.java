package clojure;

import clojure.lang.*;

public final class pprint_pr_with_base extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "format-simple-number");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "orig-pr");
 }
 public pprint_pr_with_base() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  {
   Object temp__4115__auto__2 = ((IFn)const__0.getRawRoot()).invoke(x1);
   Object __r4994 = temp__4115__auto__2;
   if (__r4994 != null && !(__r4994 == Boolean.FALSE)) {
    {
     Object s3 = temp__4115__auto__2;
     return ((IFn)const__1.getRawRoot()).invoke(s3);
    }
   } else {
    return ((IFn)const__2.getRawRoot()).invoke(x1);
   }
  }
 }
}
