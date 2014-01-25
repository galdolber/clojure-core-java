package clojure;

import clojure.lang.*;

public final class set_select extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
 }
 public set_select() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object pred1, java.lang.Object xset2) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.set_select_fn__6867(pred1), xset2, xset2);
 }
}
