package clojure;

import clojure.lang.*;

public final class instant_verify extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "when-not");
  const__4 = (clojure.lang.Symbol)Symbol.intern("clojure.instant", "fail");
  const__5 = (clojure.lang.Symbol)Symbol.intern("clojure.instant", "verify");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "pr-str");
 }
 public instant_verify() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object test3, java.lang.Object msg4) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(test3), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__4), ((IFn)const__2.getRawRoot()).invoke(msg4))))));
 }
 public java.lang.Object invoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object test3) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__5), ((IFn)const__2.getRawRoot()).invoke(test3), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke("failed: ", ((IFn)const__7.getRawRoot()).invoke(test3)))));
 }
}
