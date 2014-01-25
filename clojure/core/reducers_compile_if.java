package clojure.core;

import clojure.lang.*;

public final class reducers_compile_if extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Symbol const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "do");
 }
 public reducers_compile_if() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object exp3, java.lang.Object then4, java.lang.Object else5) {
  Object __r4368 = ((IFn)new clojure.core.reducers_compile_if_fn__6626(exp3)).invoke();
  if (__r4368 != null && !(__r4368 == Boolean.FALSE)) {
   return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(then4)));
  } else {
   return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__4), ((IFn)const__2.getRawRoot()).invoke(else5)));
  }
 }
}
