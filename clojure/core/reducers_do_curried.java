package clojure.core;

import clojure.lang.*;

public final class reducers_do_curried extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Symbol const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "butlast");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__5 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "defn");
  const__6 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "fn");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__9 = (clojure.lang.Symbol)Symbol.intern(null, "x__6667__auto__");
 }
 public reducers_do_curried() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object name1, java.lang.Object doc2, java.lang.Object meta3, java.lang.Object args4, java.lang.Object body5) {
  {
   Object cargs6 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(args4));
   return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__5), ((IFn)const__4.getRawRoot()).invoke(name1), ((IFn)const__4.getRawRoot()).invoke(doc2), ((IFn)const__4.getRawRoot()).invoke(meta3), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(cargs6), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__6), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__8.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__9))))), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(name1), cargs6, ((IFn)const__4.getRawRoot()).invoke(const__9)))))))))), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(args4), body5)))));
  }
 }
}
