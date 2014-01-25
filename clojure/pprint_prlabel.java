package clojure;

import clojure.lang.*;

public final class pprint_prlabel extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern("clojure.pprint", "prerr");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__5 = (clojure.lang.Symbol)Symbol.intern(null, "quote");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "mapcat");
 }
 public pprint_prlabel() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object prefix3, java.lang.Object arg4, java.lang.Object more_args5) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__5, prefix3), ((IFn)const__6.getRawRoot()).invoke(new clojure.pprint_prlabel_fn__7383(), ((IFn)const__4.getRawRoot()).invoke(arg4, ((IFn)const__0.getRawRoot()).invoke(more_args5))))));
 }
 public int getRequiredArity() {
  return 4;
 }
}
