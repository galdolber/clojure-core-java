package clojure;

import clojure.lang.*;

public final class core_memfn extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Symbol const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "gensym");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__6 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "fn");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__9 = (clojure.lang.Symbol)Symbol.intern(null, ".");
 }
 public core_memfn() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object name3, java.lang.Object args4) {
  {
   Object t5 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke("target"), ((IFn)const__2.getRawRoot()).invoke(name3));
   return ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__6), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__8.getRawRoot(), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(t5), args4)))), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__9), ((IFn)const__5.getRawRoot()).invoke(t5), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(name3), args4))))))));
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
