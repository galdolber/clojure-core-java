package clojure.core;

import clojure.lang.*;

public final class reducers_take_while_fn__6710 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "take-while");
 }
 Object pred1;
 public reducers_take_while_fn__6710(final Object pred1) {
  super();
  this.pred1 = pred1;
 }
 public java.lang.Object invoke(java.lang.Object x__6667__auto__1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.pred1, x__6667__auto__1);
 }
}
