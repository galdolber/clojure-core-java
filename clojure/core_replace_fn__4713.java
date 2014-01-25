package clojure;

import clojure.lang.*;

public final class core_replace_fn__4713 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "find");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "val");
 }
 Object smap1;
 public core_replace_fn__4713(final Object smap1) {
  super();
  this.smap1 = smap1;
 }
 public java.lang.Object invoke(java.lang.Object p1__4709_SHARP_1) {
  {
   Object temp__4115__auto__2 = ((IFn)const__0.getRawRoot()).invoke(this.smap1, p1__4709_SHARP_1);
   Object __r2915 = temp__4115__auto__2;
   if (__r2915 != null && !(__r2915 == Boolean.FALSE)) {
    {
     Object e3 = temp__4115__auto__2;
     return ((IFn)const__1.getRawRoot()).invoke(e3);
    }
   } else {
    return p1__4709_SHARP_1;
   }
  }
 }
}
