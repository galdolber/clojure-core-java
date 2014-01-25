package clojure;

import clojure.lang.*;

public final class core_reify extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "parse-opts+specs");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__8 = (clojure.lang.Symbol)Symbol.intern(null, "reify*");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public core_reify() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object opts_PLUS_specs3) {
  {
   Object vec__57694 = ((IFn)const__0.getRawRoot()).invoke(opts_PLUS_specs3);
   Object interfaces5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__57694), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object methods6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__57694), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__8), ((IFn)const__7.getRawRoot()).invoke(interfaces5), methods6)), ((IFn)const__9.getRawRoot()).invoke(_AMPERSAND_form1));
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
