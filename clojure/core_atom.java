package clojure;

import clojure.lang.*;

public final class core_atom extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "setup-reference");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "atom");
 }
 public core_atom() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object options2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(x1), options2);
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return new clojure.lang.Atom(((java.lang.Object)x1));
 }
 public int getRequiredArity() {
  return 1;
 }
}
