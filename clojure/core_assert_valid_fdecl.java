package clojure;

import clojure.lang.*;

public final class core_assert_valid_fdecl extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "remove");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "first");
 }
 public core_assert_valid_fdecl() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object fdecl1) {
  Object __r4322 = ((IFn)const__0.getRawRoot()).invoke(fdecl1);
  if (__r4322 != null && !(__r4322 == Boolean.FALSE)) {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)"Parameter declaration missing")));
  } else {
  }
  {
   Object argdecls2 = ((IFn)const__1.getRawRoot()).invoke(new clojure.core_assert_valid_fdecl_fn__6544(fdecl1), fdecl1);
   Object bad_args3 = ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(new clojure.core_assert_valid_fdecl_fn__6546(), argdecls2));
   Object __r4324 = bad_args3;
   if (__r4324 != null && !(__r4324 == Boolean.FALSE)) {
    Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__4.getRawRoot()).invoke("Parameter declaration ", ((IFn)const__5.getRawRoot()).invoke(bad_args3), " should be a vector"))));
    return null;
   } else {
    return null;
   }
  }
 }
}
