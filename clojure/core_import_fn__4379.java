package clojure;

import clojure.lang.*;

public final class core_import_fn__4379 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Symbol const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "quote");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "second");
 }
 public core_import_fn__4379() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__4376_SHARP_1) {
  Object __r2629 = null;
  {
   Object and__3966__auto__2 = ((IFn)const__0.getRawRoot()).invoke(p1__4376_SHARP_1);
   Object __r2630;
   Object __r2631 = and__3966__auto__2;
   if (__r2631 != null && !(__r2631 == Boolean.FALSE)) {
    __r2630 = (clojure.lang.Util.equiv(((java.lang.Object)const__2), ((java.lang.Object)((IFn)const__3.getRawRoot()).invoke(p1__4376_SHARP_1))) ? Boolean.TRUE : Boolean.FALSE);
   } else {
    __r2630 = and__3966__auto__2;
   }
   __r2629 = __r2630;
  }
  Object __r2632 = __r2629;
  if (__r2632 != null && !(__r2632 == Boolean.FALSE)) {
   return ((IFn)const__4.getRawRoot()).invoke(p1__4376_SHARP_1);
  } else {
   return p1__4376_SHARP_1;
  }
 }
}
