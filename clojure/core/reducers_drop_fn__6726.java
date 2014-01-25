package clojure.core;

import clojure.lang.*;

public final class reducers_drop_fn__6726 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "atom");
 }
 Object n1;
 public reducers_drop_fn__6726(final Object n1) {
  super();
  this.n1 = n1;
 }
 public java.lang.Object invoke(java.lang.Object f11) {
  {
   Object cnt2 = ((IFn)const__0.getRawRoot()).invoke(this.n1);
   return new clojure.core.reducers_drop_fn__6726_fn__6727(f11, cnt2);
  }
 }
}
