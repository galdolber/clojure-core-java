package clojure;

import clojure.lang.*;

public final class core_load_one extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "load");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "root-resource");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "throw-if");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "find-ns");
 }
 public core_load_one() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object lib1, java.lang.Object need_ns2, java.lang.Object require3) {
  try {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(lib1));
   Object __r3141 = null;
   {
    Object and__3966__auto__4 = need_ns2;
    Object __r3142;
    Object __r3143 = and__3966__auto__4;
    if (__r3143 != null && !(__r3143 == Boolean.FALSE)) {
     __r3142 = ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(lib1));
    } else {
     __r3142 = and__3966__auto__4;
    }
    __r3141 = __r3142;
   }
   ((IFn)const__2.getRawRoot()).invoke(__r3141, "namespace '%s' not found after loading '%s'", lib1, ((IFn)const__1.getRawRoot()).invoke(lib1));
   Object __r3145 = require3;
   if (__r3145 != null && !(__r3145 == Boolean.FALSE)) {
    return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.core_load_one_fn__4974(lib1))));
   } else {
    return null;
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
