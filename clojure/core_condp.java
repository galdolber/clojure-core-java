package clojure;

import clojure.lang.*;

public final class core_condp extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "gensym");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__4 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "vector");
 }
 public core_condp() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object pred3, java.lang.Object expr4, java.lang.Object clauses5) {
  {
   Object gpred6 = ((IFn)const__0.getRawRoot()).invoke("pred__");
   Object gexpr7 = ((IFn)const__0.getRawRoot()).invoke("expr__");
   Object emit8 = new clojure.core_condp_emit__5075();
   Object gres9 = ((IFn)const__0.getRawRoot()).invoke("res__");
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__6.getRawRoot(), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(gpred6), ((IFn)const__3.getRawRoot()).invoke(pred3), ((IFn)const__3.getRawRoot()).invoke(gexpr7), ((IFn)const__3.getRawRoot()).invoke(expr4))))), ((IFn)const__3.getRawRoot()).invoke(((IFn)emit8).invoke(gpred6, gexpr7, clauses5))));
  }
 }
 public int getRequiredArity() {
  return 4;
 }
}
