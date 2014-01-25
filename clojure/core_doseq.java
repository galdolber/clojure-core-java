package clojure;

import clojure.lang.*;

public final class core_doseq extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final java.lang.Object const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "even?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__10 = (java.lang.Object)1L;
 }
 public core_doseq() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object seq_exprs3, java.lang.Object body4) {
  Object __r2598 = ((IFn)const__0.getRawRoot()).invoke(seq_exprs3);
  if (__r2598 != null && !(__r2598 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "a vector for its binding", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  Object __r2600 = ((IFn)const__6.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)seq_exprs3))));
  if (__r2600 != null && !(__r2600 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "an even number of forms in binding vector", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  {
   Object step5 = new clojure.core_doseq_step__4344(body4);
   return ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)((IFn)step5).invoke(null, ((IFn)const__9.getRawRoot()).invoke(seq_exprs3))), (int)RT.intCast(1L)));
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
