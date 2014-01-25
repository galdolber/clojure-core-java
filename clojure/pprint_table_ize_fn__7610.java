package clojure;

import clojure.lang.*;

public final class pprint_table_ize_fn__7610 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "key");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "find-var");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "val");
 }
 Object t1;
 public pprint_table_ize_fn__7610(final Object t1) {
  super();
  this.t1 = t1;
 }
 public java.lang.Object invoke(java.lang.Object p1__7609_SHARP_1) {
  {
   Object temp__4117__auto__2 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)this.t1), ((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(p1__7609_SHARP_1))));
   Object __r4996 = temp__4117__auto__2;
   if (__r4996 != null && !(__r4996 == Boolean.FALSE)) {
    {
     Object v3 = temp__4117__auto__2;
     return RT.vector(((IFn)const__2.getRawRoot()).invoke(v3), ((IFn)const__3.getRawRoot()).invoke(p1__7609_SHARP_1));
    }
   } else {
    return null;
   }
  }
 }
}
