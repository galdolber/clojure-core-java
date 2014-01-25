package clojure;

import clojure.lang.*;

public final class core_map_fn__4236 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object c12;
 Object c23;
 Object f1;
 public core_map_fn__4236(final Object c12, final Object c23, final Object f1) {
  super();
  this.c12 = c12;
  this.c23 = c23;
  this.f1 = f1;
 }
 public java.lang.Object invoke() {
  {
   Object s11 = ((IFn)const__0.getRawRoot()).invoke(this.c12);
   Object s22 = ((IFn)const__0.getRawRoot()).invoke(this.c23);
   Object __r2479 = null;
   {
    Object and__3966__auto__3 = s11;
    Object __r2480;
    Object __r2481 = and__3966__auto__3;
    if (__r2481 != null && !(__r2481 == Boolean.FALSE)) {
     __r2480 = s22;
    } else {
     __r2480 = and__3966__auto__3;
    }
    __r2479 = __r2480;
   }
   Object __r2482 = __r2479;
   if (__r2482 != null && !(__r2482 == Boolean.FALSE)) {
    return ((IFn)const__1.getRawRoot()).invoke(((IFn)this.f1).invoke(((IFn)const__2.getRawRoot()).invoke(s11), ((IFn)const__2.getRawRoot()).invoke(s22)), ((IFn)const__3.getRawRoot()).invoke(this.f1, ((IFn)const__4.getRawRoot()).invoke(s11), ((IFn)const__4.getRawRoot()).invoke(s22)));
   } else {
    return null;
   }
  }
 }
}
