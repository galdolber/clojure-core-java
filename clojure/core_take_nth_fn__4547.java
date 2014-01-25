package clojure;

import clojure.lang.*;

public final class core_take_nth_fn__4547 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "take-nth");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "drop");
 }
 Object n1;
 Object coll2;
 public core_take_nth_fn__4547(final Object n1, final Object coll2) {
  super();
  this.n1 = n1;
  this.coll2 = coll2;
 }
 public java.lang.Object invoke() {
  {
   Object temp__4117__auto__1 = ((IFn)const__0.getRawRoot()).invoke(this.coll2);
   Object __r2774 = temp__4117__auto__1;
   if (__r2774 != null && !(__r2774 == Boolean.FALSE)) {
    {
     Object s2 = temp__4117__auto__1;
     return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(s2), ((IFn)const__3.getRawRoot()).invoke(this.n1, ((IFn)const__4.getRawRoot()).invoke(this.n1, s2)));
    }
   } else {
    return null;
   }
  }
 }
}
