package clojure;

import clojure.lang.*;

public final class pprint_deftype extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Symbol const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Symbol const__16;
 public static final clojure.lang.Symbol const__17;
 public static final clojure.lang.Symbol const__18;
 public static final clojure.lang.Symbol const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.Symbol const__23;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__5 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "defstruct");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "type-tag");
  const__7 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "alter-meta!");
  const__8 = (clojure.lang.Symbol)Symbol.intern(null, "var");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "assoc");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "private");
  const__11 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "defn-");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__16 = (clojure.lang.Symbol)Symbol.intern(null, "&");
  const__17 = (clojure.lang.Symbol)Symbol.intern(null, "vals__7418__auto__");
  const__18 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "apply");
  const__19 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "struct");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "keyword");
  const__21 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "defn-");
  const__22 = (clojure.lang.Symbol)Symbol.intern(null, "x__7419__auto__");
  const__23 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "=");
 }
 public pprint_deftype() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object type_name3, java.lang.Object fields4) {
  {
   Object name_str5 = ((IFn)const__0.getRawRoot()).invoke(type_name3);
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__5), ((IFn)const__3.getRawRoot()).invoke(type_name3), ((IFn)const__3.getRawRoot()).invoke(const__6), fields4))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__7), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__8), ((IFn)const__3.getRawRoot()).invoke(type_name3)))), ((IFn)const__3.getRawRoot()).invoke(const__9), ((IFn)const__3.getRawRoot()).invoke(const__10), ((IFn)const__3.getRawRoot()).invoke(Boolean.TRUE)))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__11), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke("make-", name_str5))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__15.getRawRoot(), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__16), ((IFn)const__3.getRawRoot()).invoke(const__17))))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__18), ((IFn)const__3.getRawRoot()).invoke(const__19), ((IFn)const__3.getRawRoot()).invoke(type_name3), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(name_str5)), ((IFn)const__3.getRawRoot()).invoke(const__17))))))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__21), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(name_str5, "?"))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__15.getRawRoot(), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__22))))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__23), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__6), ((IFn)const__3.getRawRoot()).invoke(const__22)))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(name_str5))))))))));
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
