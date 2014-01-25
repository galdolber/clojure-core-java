package clojure;

import clojure.lang.*;

public final class core_pmap_step__6339_fn__6341 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 Object step0;
 Object vs6;
 Object xs5;
 Object x4;
 Object fs2;
 public core_pmap_step__6339_fn__6341(final Object step0, final Object vs6, final Object xs5, final Object x4, final Object fs2) {
  super();
  this.step0 = step0;
  this.vs6 = vs6;
  this.xs5 = xs5;
  this.x4 = x4;
  this.fs2 = fs2;
 }
 public java.lang.Object invoke() {
  {
   Object temp__4115__auto__1 = ((IFn)const__0.getRawRoot()).invoke(this.fs2);
   Object __r4088 = temp__4115__auto__1;
   if (__r4088 != null && !(__r4088 == Boolean.FALSE)) {
    {
     Object s2 = temp__4115__auto__1;
     return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this.x4), ((IFn)this.step0).invoke(this.xs5, ((IFn)const__3.getRawRoot()).invoke(s2)));
    }
   } else {
    return ((IFn)const__4.getRawRoot()).invoke(const__2.getRawRoot(), this.vs6);
   }
  }
 }
}
