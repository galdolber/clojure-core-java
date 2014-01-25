package clojure;

import clojure.lang.*;

public final class core_pmap_step__6345_fn__6346 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "every?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "identity");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object step0;
 Object cs1;
 public core_pmap_step__6345_fn__6346(final Object step0, final Object cs1) {
  super();
  this.step0 = step0;
  this.cs1 = cs1;
 }
 public java.lang.Object invoke() {
  {
   Object ss1 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), this.cs1);
   Object __r4090 = ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), ss1);
   if (__r4090 != null && !(__r4090 == Boolean.FALSE)) {
    return ((IFn)const__4.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(const__5.getRawRoot(), ss1), ((IFn)this.step0).invoke(((IFn)const__0.getRawRoot()).invoke(const__6.getRawRoot(), ss1)));
   } else {
    return null;
   }
  }
 }
}
