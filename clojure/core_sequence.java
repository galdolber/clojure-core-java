package clojure;

import clojure.lang.*;

public final class core_sequence extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
 }
 public core_sequence() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  Object __r2461 = ((IFn)const__0.getRawRoot()).invoke(coll1);
  if (__r2461 != null && !(__r2461 == Boolean.FALSE)) {
   return coll1;
  } else {
   {
    Object or__3968__auto__2 = ((IFn)const__1.getRawRoot()).invoke(coll1);
    Object __r2463 = or__3968__auto__2;
    if (__r2463 != null && !(__r2463 == Boolean.FALSE)) {
     return or__3968__auto__2;
    } else {
     return clojure.lang.PersistentList.EMPTY;
    }
   }
  }
 }
}
