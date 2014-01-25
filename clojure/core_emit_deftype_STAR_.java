package clojure;

import clojure.lang.*;

public final class core_emit_deftype_STAR_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Symbol const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Keyword const__12;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "namespace-munge");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__7 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.IType");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__11 = (clojure.lang.Symbol)Symbol.intern(null, "deftype*");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "implements");
 }
 public core_emit_deftype_STAR_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object tagname1, java.lang.Object name2, java.lang.Object fields3, java.lang.Object interfaces4, java.lang.Object methods5) {
  {
   Object classname6 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4.get()), ".", name2)), ((IFn)const__5.getRawRoot()).invoke(name2));
   Object interfaces7 = ((IFn)const__6.getRawRoot()).invoke(interfaces4, const__7);
   return ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11), ((IFn)const__10.getRawRoot()).invoke(tagname1), ((IFn)const__10.getRawRoot()).invoke(classname6), ((IFn)const__10.getRawRoot()).invoke(fields3), ((IFn)const__10.getRawRoot()).invoke(const__12), ((IFn)const__10.getRawRoot()).invoke(interfaces7), methods5));
  }
 }
}
