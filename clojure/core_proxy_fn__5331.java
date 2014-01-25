package clojure;

import clojure.lang.*;

public final class core_proxy_fn__5331 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "resolve");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public core_proxy_fn__5331() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__5328_SHARP_1) {
  {
   Object or__3968__auto__2 = ((IFn)const__0.getRawRoot()).invoke(p1__5328_SHARP_1);
   Object __r3395 = or__3968__auto__2;
   if (__r3395 != null && !(__r3395 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke("Can't resolve: ", p1__5328_SHARP_1))));
    return null;
   }
  }
 }
}
