package clojure;

import clojure.lang.*;

public final class core__DOT__DOT_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Symbol const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern(null, ".");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "..");
  const__5 = (clojure.lang.Symbol)Symbol.intern(null, ".");
 }
 public core__DOT__DOT_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object x3, java.lang.Object form4, java.lang.Object more5) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__4), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__5), ((IFn)const__2.getRawRoot()).invoke(x3), ((IFn)const__2.getRawRoot()).invoke(form4)))), more5));
 }
 public java.lang.Object invoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object x3, java.lang.Object form4) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(x3), ((IFn)const__2.getRawRoot()).invoke(form4)));
 }
 public int getRequiredArity() {
  return 4;
 }
}
