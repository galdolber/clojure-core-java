package clojure;

import clojure.lang.*;

public final class core_reductions_fn__6385 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reductions");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object coll3;
 Object init2;
 Object f1;
 public core_reductions_fn__6385(final Object coll3, final Object init2, final Object f1) {
  super();
  this.coll3 = coll3;
  this.init2 = init2;
  this.f1 = f1;
 }
 public java.lang.Object invoke() {
  {
   Object temp__4117__auto__1 = ((IFn)const__0.getRawRoot()).invoke(this.coll3);
   Object __r4114 = temp__4117__auto__1;
   if (__r4114 != null && !(__r4114 == Boolean.FALSE)) {
    {
     Object s2 = temp__4117__auto__1;
     return ((IFn)const__1.getRawRoot()).invoke(this.f1, ((IFn)this.f1).invoke(this.init2, ((IFn)const__2.getRawRoot()).invoke(s2)), ((IFn)const__3.getRawRoot()).invoke(s2));
    }
   } else {
    return null;
   }
  }
 }
}
