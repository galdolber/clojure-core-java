package clojure;

import clojure.lang.*;

public final class core_interleave_fn__4553 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "interleave");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object c11;
 Object c22;
 public core_interleave_fn__4553(final Object c11, final Object c22) {
  super();
  this.c11 = c11;
  this.c22 = c22;
 }
 public java.lang.Object invoke() {
  {
   Object s11 = ((IFn)const__0.getRawRoot()).invoke(this.c11);
   Object s22 = ((IFn)const__0.getRawRoot()).invoke(this.c22);
   Object __r2776 = null;
   {
    Object and__3966__auto__3 = s11;
    Object __r2777;
    Object __r2778 = and__3966__auto__3;
    if (__r2778 != null && !(__r2778 == Boolean.FALSE)) {
     __r2777 = s22;
    } else {
     __r2777 = and__3966__auto__3;
    }
    __r2776 = __r2777;
   }
   Object __r2779 = __r2776;
   if (__r2779 != null && !(__r2779 == Boolean.FALSE)) {
    return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(s11), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(s22), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(s11), ((IFn)const__4.getRawRoot()).invoke(s22))));
   } else {
    return null;
   }
  }
 }
}
