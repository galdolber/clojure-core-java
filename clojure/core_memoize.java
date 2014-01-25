package clojure;

import clojure.lang.*;

public final class core_memoize extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "atom");
 }
 public core_memoize() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  {
   Object mem2 = ((IFn)const__0.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY);
   return new clojure.core_memoize_fn__5070(f1, mem2);
  }
 }
}
