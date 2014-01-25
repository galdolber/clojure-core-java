package clojure;

import clojure.lang.*;

public final class core_map_fn__4239 extends clojure.lang.AFunction {
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
 Object f1;
 Object c34;
 Object c23;
 Object c12;
 public core_map_fn__4239(final Object f1, final Object c34, final Object c23, final Object c12) {
  super();
  this.f1 = f1;
  this.c34 = c34;
  this.c23 = c23;
  this.c12 = c12;
 }
 public java.lang.Object invoke() {
  {
   Object s11 = ((IFn)const__0.getRawRoot()).invoke(this.c12);
   Object s22 = ((IFn)const__0.getRawRoot()).invoke(this.c23);
   Object s33 = ((IFn)const__0.getRawRoot()).invoke(this.c34);
   Object __r2484 = null;
   {
    Object and__3966__auto__4 = s11;
    Object __r2485;
    Object __r2486 = and__3966__auto__4;
    if (__r2486 != null && !(__r2486 == Boolean.FALSE)) {
     Object __r2487 = null;
     {
      Object and__3966__auto__5 = s22;
      Object __r2488;
      Object __r2489 = and__3966__auto__5;
      if (__r2489 != null && !(__r2489 == Boolean.FALSE)) {
       __r2488 = s33;
      } else {
       __r2488 = and__3966__auto__5;
      }
      __r2487 = __r2488;
     }
     __r2485 = __r2487;
    } else {
     __r2485 = and__3966__auto__4;
    }
    __r2484 = __r2485;
   }
   Object __r2490 = __r2484;
   if (__r2490 != null && !(__r2490 == Boolean.FALSE)) {
    return ((IFn)const__1.getRawRoot()).invoke(((IFn)this.f1).invoke(((IFn)const__2.getRawRoot()).invoke(s11), ((IFn)const__2.getRawRoot()).invoke(s22), ((IFn)const__2.getRawRoot()).invoke(s33)), ((IFn)const__3.getRawRoot()).invoke(this.f1, ((IFn)const__4.getRawRoot()).invoke(s11), ((IFn)const__4.getRawRoot()).invoke(s22), ((IFn)const__4.getRawRoot()).invoke(s33)));
   } else {
    return null;
   }
  }
 }
}
