package clojure;

import clojure.lang.*;

public final class core_parse_opts_PLUS_specs_fn__5761 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "var?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "resolve");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "on");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "deref");
 }
 public core_parse_opts_PLUS_specs_fn__5761() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__5759_SHARP_1) {
  Object __r3709 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(p1__5759_SHARP_1));
  if (__r3709 != null && !(__r3709 == Boolean.FALSE)) {
   return RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(p1__5759_SHARP_1)), Keyword.intern(null, "on"));
  } else {
   return p1__5759_SHARP_1;
  }
 }
}
