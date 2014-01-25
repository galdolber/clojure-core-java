package clojure;

import clojure.lang.*;

public final class pprint_with_pretty_writer extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Symbol const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Symbol const__10;
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Symbol const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Symbol const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Symbol const__16;
 public static final clojure.lang.Symbol const__17;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__6 = (clojure.lang.Symbol)Symbol.intern(null, "base-writer__7617__auto__");
  const__7 = (clojure.lang.Symbol)Symbol.intern(null, "new-writer__7618__auto__");
  const__8 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "not");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.pprint", "pretty-writer?");
  const__10 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "binding");
  const__11 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "*out*");
  const__12 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__13 = (clojure.lang.Symbol)Symbol.intern("clojure.pprint", "make-pretty-writer");
  const__14 = (clojure.lang.Symbol)Symbol.intern("clojure.pprint", "*print-right-margin*");
  const__15 = (clojure.lang.Symbol)Symbol.intern("clojure.pprint", "*print-miser-width*");
  const__16 = (clojure.lang.Symbol)Symbol.intern(null, ".ppflush");
  const__17 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "*out*");
 }
 public pprint_with_pretty_writer() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object base_writer3, java.lang.Object body4) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__6), ((IFn)const__2.getRawRoot()).invoke(base_writer3), ((IFn)const__2.getRawRoot()).invoke(const__7), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__8), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__9), ((IFn)const__2.getRawRoot()).invoke(const__6))))))))))), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__10), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__11), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__12), ((IFn)const__2.getRawRoot()).invoke(const__7), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__13), ((IFn)const__2.getRawRoot()).invoke(const__6), ((IFn)const__2.getRawRoot()).invoke(const__14), ((IFn)const__2.getRawRoot()).invoke(const__15)))), ((IFn)const__2.getRawRoot()).invoke(const__6)))))))), body4, ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__16), ((IFn)const__2.getRawRoot()).invoke(const__17)))))))));
 }
 public int getRequiredArity() {
  return 3;
 }
}
