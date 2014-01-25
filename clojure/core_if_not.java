package clojure;

import clojure.lang.*;

public final class core_if_not extends clojure.lang.AFunction {
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
  const__3 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "if-not");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__5 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "not");
 }
 public core_if_not() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object test3, java.lang.Object then4, java.lang.Object else5) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__4), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__5), ((IFn)const__2.getRawRoot()).invoke(test3)))), ((IFn)const__2.getRawRoot()).invoke(then4), ((IFn)const__2.getRawRoot()).invoke(else5)));
 }
 public java.lang.Object invoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object test3, java.lang.Object then4) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(test3), ((IFn)const__2.getRawRoot()).invoke(then4), ((IFn)const__2.getRawRoot()).invoke(null)));
 }
}
