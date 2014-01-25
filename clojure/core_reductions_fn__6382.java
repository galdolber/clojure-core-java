package clojure;

import clojure.lang.*;

public final class core_reductions_fn__6382 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reductions");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "list");
 }
 Object coll2;
 Object f1;
 public core_reductions_fn__6382(final Object coll2, final Object f1) {
  super();
  this.coll2 = coll2;
  this.f1 = f1;
 }
 public java.lang.Object invoke() {
  {
   Object temp__4115__auto__1 = ((IFn)const__0.getRawRoot()).invoke(this.coll2);
   Object __r4112 = temp__4115__auto__1;
   if (__r4112 != null && !(__r4112 == Boolean.FALSE)) {
    {
     Object s2 = temp__4115__auto__1;
     return ((IFn)const__1.getRawRoot()).invoke(this.f1, ((IFn)const__2.getRawRoot()).invoke(s2), ((IFn)const__3.getRawRoot()).invoke(s2));
    }
   } else {
    return ((IFn)const__4.getRawRoot()).invoke(((IFn)this.f1).invoke());
   }
  }
 }
}
