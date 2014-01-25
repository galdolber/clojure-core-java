package clojure.core;

import clojure.lang.*;

public final class reducers_defcurried extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "do-curried");
 }
 public reducers_defcurried() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object name3, java.lang.Object doc4, java.lang.Object meta5, java.lang.Object args6, java.lang.Object body7) {
  return ((IFn)const__0.getRawRoot()).invoke(name3, doc4, meta5, args6, body7);
 }
 public int getRequiredArity() {
  return 6;
 }
}
