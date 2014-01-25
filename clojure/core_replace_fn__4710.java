package clojure;

import clojure.lang.*;

public final class core_replace_fn__4710 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "find");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "val");
 }
 Object smap1;
 public core_replace_fn__4710(final Object smap1) {
  super();
  this.smap1 = smap1;
 }
 public java.lang.Object invoke(java.lang.Object v1, java.lang.Object i2) {
  {
   Object temp__4115__auto__3 = ((IFn)const__0.getRawRoot()).invoke(this.smap1, ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)v1), (int)RT.intCast(i2))));
   Object __r2913 = temp__4115__auto__3;
   if (__r2913 != null && !(__r2913 == Boolean.FALSE)) {
    {
     Object e4 = temp__4115__auto__3;
     return ((IFn)const__2.getRawRoot()).invoke(v1, i2, ((IFn)const__3.getRawRoot()).invoke(e4));
    }
   } else {
    return v1;
   }
  }
 }
}
