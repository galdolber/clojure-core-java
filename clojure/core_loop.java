package clojure;

import clojure.lang.*;

public final class core_loop extends clojure.lang.RestFn {
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
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Var const__14;
 public static final java.lang.Object const__15;
 public static final clojure.lang.Var const__16;
 public static final java.lang.Object const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.Var const__23;
 public static final clojure.lang.Var const__24;
 public static final clojure.lang.Symbol const__25;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "even?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "destructure");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__13 = (clojure.lang.Symbol)Symbol.intern(null, "loop*");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "take-nth");
  const__15 = (java.lang.Object)2L;
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "drop");
  const__17 = (java.lang.Object)1L;
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__21 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__22 = (clojure.lang.Symbol)Symbol.intern(null, "loop*");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__24 = (clojure.lang.Var)RT.var("clojure.core", "interleave");
  const__25 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
 }
 public core_loop() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object bindings3, java.lang.Object body4) {
  Object __r2860 = ((IFn)const__0.getRawRoot()).invoke(bindings3);
  if (__r2860 != null && !(__r2860 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "a vector for its binding", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  Object __r2862 = ((IFn)const__6.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)bindings3))));
  if (__r2862 != null && !(__r2862 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "an even number of forms in binding vector", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  {
   Object db5 = ((IFn)const__8.getRawRoot()).invoke(bindings3);
   if (clojure.lang.Util.equiv(((java.lang.Object)db5), ((java.lang.Object)bindings3))) {
    return ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__13), ((IFn)const__12.getRawRoot()).invoke(bindings3), body4));
   } else {
    {
     Object vs6 = ((IFn)const__14.getRawRoot()).invoke(const__15, ((IFn)const__16.getRawRoot()).invoke(const__17, bindings3));
     Object bs7 = ((IFn)const__14.getRawRoot()).invoke(const__15, bindings3);
     Object gs8 = ((IFn)const__18.getRawRoot()).invoke(new clojure.core_loop_fn__4600(), bs7);
     Object bfs9 = ((IFn)const__19.getRawRoot()).invoke(new clojure.core_loop_fn__4603(), clojure.lang.PersistentVector.EMPTY, ((IFn)const__18.getRawRoot()).invoke(const__20.getRawRoot(), bs7, vs6, gs8));
     return ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__21), ((IFn)const__12.getRawRoot()).invoke(bfs9), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__22), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__23.getRawRoot()).invoke(((IFn)const__24.getRawRoot()).invoke(gs8, gs8))), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__25), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__23.getRawRoot()).invoke(((IFn)const__24.getRawRoot()).invoke(bs7, gs8))), body4))))))));
    }
   }
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
