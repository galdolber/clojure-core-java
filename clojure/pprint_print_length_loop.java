package clojure;

import clojure.lang.*;

public final class pprint_print_length_loop extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Symbol const__10;
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Symbol const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Symbol const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Symbol const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Symbol const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Keyword const__20;
 public static final clojure.lang.Symbol const__21;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "gensym");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "pll-mod-body");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__5 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "loop");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__8 = (java.lang.Object)0L;
  const__9 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__10 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "or");
  const__11 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "not");
  const__12 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "*print-length*");
  const__13 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "<");
  const__14 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "*print-length*");
  const__15 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__16 = (clojure.lang.Symbol)Symbol.intern(null, ".write");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__18 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "*out*");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__20 = (clojure.lang.Keyword)Keyword.intern(null, "tag");
  const__21 = (clojure.lang.Symbol)Symbol.intern(null, "java.io.Writer");
 }
 public pprint_print_length_loop() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object bindings3, java.lang.Object body4) {
  {
   Object count_var5 = ((IFn)const__0.getRawRoot()).invoke("length-count");
   Object mod_body6 = ((IFn)const__1.getRawRoot()).invoke(count_var5, body4);
   return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__5), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__7.getRawRoot(), count_var5, const__8, bindings3)), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__9), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__10), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__11), ((IFn)const__4.getRawRoot()).invoke(const__12)))), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__13), ((IFn)const__4.getRawRoot()).invoke(count_var5), ((IFn)const__4.getRawRoot()).invoke(const__14))))))), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__15), mod_body6))), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__16), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__17.getRawRoot()).invoke(const__18, ((IFn)const__6.getRawRoot()).invoke(const__19.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__20), ((IFn)const__4.getRawRoot()).invoke(const__21)))))), ((IFn)const__4.getRawRoot()).invoke("...")))))))));
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
