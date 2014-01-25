package clojure;

import clojure.lang.*;

public final class core_the_ns extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.Namespace.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "find-ns");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public core_the_ns() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  if ((x1 instanceof clojure.lang.Namespace)) {
   return x1;
  } else {
   {
    Object or__3968__auto__2 = ((IFn)const__2.getRawRoot()).invoke(x1);
    Object __r2726 = or__3968__auto__2;
    if (__r2726 != null && !(__r2726 == Boolean.FALSE)) {
     return or__3968__auto__2;
    } else {
     Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)((IFn)const__3.getRawRoot()).invoke("No namespace: ", x1, " found"))));
     return null;
    }
   }
  }
 }
}
