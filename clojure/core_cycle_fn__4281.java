package clojure;

import clojure.lang.*;

public final class core_cycle_fn__4281 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "cycle");
 }
 Object coll1;
 public core_cycle_fn__4281(final Object coll1) {
  super();
  this.coll1 = coll1;
 }
 public java.lang.Object invoke() {
  {
   Object temp__4117__auto__1 = ((IFn)const__0.getRawRoot()).invoke(this.coll1);
   Object __r2521 = temp__4117__auto__1;
   if (__r2521 != null && !(__r2521 == Boolean.FALSE)) {
    {
     Object s2 = temp__4117__auto__1;
     return ((IFn)const__1.getRawRoot()).invoke(s2, ((IFn)const__2.getRawRoot()).invoke(s2));
    }
   } else {
    return null;
   }
  }
 }
}
